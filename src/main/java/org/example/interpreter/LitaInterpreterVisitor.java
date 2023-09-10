package org.example.interpreter;

import org.example.parser.LitaBaseVisitor;
import org.example.parser.LitaParser;

import static org.example.parser.LitaParser.ADD;
import static org.example.parser.LitaParser.EQ;
import static org.example.parser.LitaParser.GT;
import static org.example.parser.LitaParser.GTE;
import static org.example.parser.LitaParser.LT;
import static org.example.parser.LitaParser.LTE;
import static org.example.parser.LitaParser.MULT;
import static org.example.parser.LitaParser.NA;
import static org.example.parser.LitaParser.SY;
import static org.example.runtime.Vina.DISO;
import static org.example.runtime.Vina.MARINA;
import static org.example.runtime.Vina.of;

public class LitaInterpreterVisitor extends LitaBaseVisitor<Integer> {
  public final Environment env;

  public LitaInterpreterVisitor() {
    super();
    this.env = new Environment();
  }

  @Override
  public Integer visitIsa_avoaka(LitaParser.Isa_avoakaContext ctx) {
    var output = visit(ctx.rafitrisa());
    // free the symbol table
    env.free();
    return output;
  }

  @Override
  public Integer visitIsa_ampidirina(LitaParser.Isa_ampidirinaContext ctx) {
    int input = Integer.parseInt(ctx.NOMERIKA().getText());
    env.registerSymbol("LITA_ISA_NAMPIDIRINA", input);
    return input;
  }

  // FIXME: assign and declare
  @Override
  public Integer visitAssign(LitaParser.AssignContext ctx) {
    String id = ctx.VOAMBOLANA().getText();
    int value = visit(ctx.rafitrisa());
    env.registerSymbol(id, value);
    return value;
  }

  @Override
  public Integer visitDeclare(LitaParser.DeclareContext ctx) {
    String id = ctx.VOAMBOLANA().getText();
    int value = visit(ctx.rafitrisa());
    env.registerSymbol(id, value);
    return value;
  }

  @Override
  public Integer visitAddSub(LitaParser.AddSubContext ctx) {
    int left = visit(ctx.rafitrisa(0));
    int right = visit(ctx.rafitrisa(1));
    if (ctx.op.getType() == ADD) return left + right;
    return left - right;
  }

  @Override
  public Integer visitMultDiv(LitaParser.MultDivContext ctx) {
    int left = visit(ctx.rafitrisa(0));
    int right = visit(ctx.rafitrisa(1));
    if (ctx.op.getType() == MULT) return left * right;
    return left / right;
  }

  @Override
  public Integer visitIdent(LitaParser.IdentContext ctx) {
    String id = ctx.VOAMBOLANA().getText();
    return env.getSymbol(id);
  }

  @Override
  public Integer visitIfStmt(LitaParser.IfStmtContext ctx) {
    var cond = of(visit(ctx.vina()));
    if (cond.bool()) {
      return visit(ctx.baiko());
    }
    return DISO.val();
  }

  @Override
  public Integer visitParenthesizedRafitrisa(LitaParser.ParenthesizedRafitrisaContext ctx) {
    return visit(ctx.rafitrisa());
  }

  @Override
  public Integer visitParenthesizedVina(LitaParser.ParenthesizedVinaContext ctx) {
    return visit(ctx.vina());
  }

  @Override
  public Integer visitComparison(LitaParser.ComparisonContext ctx) {
    if (!ctx.rafitrisa().isEmpty()) {
      int e1 = visit(ctx.rafitrisa(0));
      var e2 = visit(ctx.rafitrisa(1));
      return evalComparison(ctx.cop.getType(), e1, e2);
    }
    if (!ctx.vina().isEmpty()) {
      var e1 = of(visit(ctx.vina(0)));
      var e2 = of(visit(ctx.vina(1)));
      return evalVinaExpr(ctx.cop.getType(), e1.bool(), e2.bool());
    }
    return MARINA.val();
  }

  @Override
  public Integer visitMarina(LitaParser.MarinaContext ctx) {
    return of(true).val();
  }

  @Override
  public Integer visitDiso(LitaParser.DisoContext ctx) {
    return of(false).val();
  }

  @Override
  public Integer visitNumeric(LitaParser.NumericContext ctx) {
    return Integer.parseInt(ctx.NOMERIKA().getText());
  }

  @Override
  public Integer visitDoWhileStmt(LitaParser.DoWhileStmtContext ctx) {
    do {
      visit(ctx.baiko());
    } while (of(visit(ctx.vina())).bool());
    return MARINA.val();
  }

  private Integer evalComparison(int comparisonType, int e1, int e2) {
    return switch (comparisonType) {
      case GT -> of(e1 > e2).val();
      case LT -> of(e1 < e2).val();
      case GTE -> of(e1 >= e2).val();
      case LTE -> of(e1 <= e2).val();
      case EQ -> of(e1 == e2).val();
      default -> DISO.val();
    };
  }

  private Integer evalVinaExpr(int comparisonType, boolean e1, boolean e2) {
    return switch (comparisonType) {
      case NA -> of(e1 || e2).val();
      case SY -> of(e1 && e2).val();
      default -> DISO.val();
    };
  }
}
