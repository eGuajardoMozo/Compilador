/* magu.java */
/* Generated By:JavaCC: Do not edit this line. magu.java */
import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;

class magu extends TurtleGraphicsWindow implements maguConstants {
        public magu()
    {
        super( 600, 600 );
    }


        public static void main(String[] args) throws ParseException
        {
                try
                {
                        magu scanner = new magu(System.in);
                        scanner.Programa();
                        System.out.println("OK!");
                }
                catch(ParseException e)
                {
                        System.out.println(e.getMessage());
                        System.out.println("Error!");
                }
        }

        // Variable donde se guarda el valor de las expresiones
        int valorExp = 0;

        int variableLocal;
        Token nombreFuncActual;
        int insideWhile = 0;
        int boolEsToken = 0;
        String nombre = "empty"; //variable de Bool() para condicion1 
        String nombre2 = "empty"; //variable de Bool() para condicion2
        Token op;

  final public void Programa() throws ParseException {
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TK_ID:{
        ;
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      Asignacion();
    }
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TK_FUNC:{
        ;
        break;
        }
      default:
        jj_la1[1] = jj_gen;
        break label_2;
      }
      Definicion_Func();
    }
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TK_ARR:{
        ;
        break;
        }
      default:
        jj_la1[2] = jj_gen;
        break label_3;
      }
      Arreglo();
    }
    Secuencia();
    jj_consume_token(0);
  }

  final public void Func() throws ParseException {Token t; String s, s2; int value, value2;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TK_FORWARD:{
      jj_consume_token(TK_FORWARD);
      jj_consume_token(TK_LPAR);
      value = Exp();
      jj_consume_token(TK_RPAR);
forward(value);
      break;
      }
    case TK_LEFT:{
      jj_consume_token(TK_LEFT);
      jj_consume_token(TK_LPAR);
      value = Exp();
      jj_consume_token(TK_RPAR);
left(value);
      break;
      }
    case TK_RIGHT:{
      jj_consume_token(TK_RIGHT);
      jj_consume_token(TK_LPAR);
      value = Exp();
      jj_consume_token(TK_RPAR);
right(value);
      break;
      }
    case TK_INPUT:{
      jj_consume_token(TK_INPUT);
      jj_consume_token(TK_LPAR);
      t = jj_consume_token(TK_ID);
      jj_consume_token(TK_RPAR);
// Crea un cuadro de dialogo. El input se guarda en la string s.
                                        s = (String)JOptionPane.showInputDialog(
                                            null, "Escribe el valor de " + t.image, "Input", JOptionPane.PLAIN_MESSAGE, null, null, null);

                                        // Si el campo quedo vacío o se cerró la ventana, mostrar mensaje de error y terminar ejecucion.
                                        if(s==null || s.trim().isEmpty()) {
                                                System.out.println("No se dio valor a la variable " + t.image);
                                                System.exit(0);
                                        }
                                        // De lo contrario asignar valor a variable.
                                        else {
                                                if (insideWhile == 1)
                                                {
                                                        TablaBools.asignarValor(t.image,  Integer.parseInt( s ) );
                                                }
                                                TablaVariables.asignarValor(t,  Integer.parseInt( s ) );
                                        }
      break;
      }
    case TK_PRINT:{
      jj_consume_token(TK_PRINT);
      jj_consume_token(TK_LPAR);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TK_ID:{
        t = jj_consume_token(TK_ID);
if (variableLocal == 0 ) {s = String.valueOf(TablaVariables.getValor(t)); }
                                                                        else {s = String.valueOf(TablaVariablesLocal.getValor(t)); }
        break;
        }
      case TK_STRING:{
        t = jj_consume_token(TK_STRING);
s = t.image.substring(1, t.image.length() - 1);
        break;
        }
      default:
        jj_la1[3] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      label_4:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case TK_PLUS:{
          ;
          break;
          }
        default:
          jj_la1[4] = jj_gen;
          break label_4;
        }
        jj_consume_token(TK_PLUS);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case TK_ID:{
          t = jj_consume_token(TK_ID);
if (variableLocal == 0 ) { s2 = String.valueOf(TablaVariables.getValor(t)); s = s + s2; }
                                                                        else { s2 = String.valueOf(TablaVariablesLocal.getValor(t)); s = s + s2; }
          break;
          }
        case TK_STRING:{
          t = jj_consume_token(TK_STRING);
s2 = t.image.substring(1, t.image.length() - 1); s = s + s2;
          break;
          }
        default:
          jj_la1[5] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
      jj_consume_token(TK_RPAR);
System.out.println(s);
      break;
      }
    case TK_PENCILUP:{
      jj_consume_token(TK_PENCILUP);
      jj_consume_token(TK_LPAR);
      jj_consume_token(TK_RPAR);
penup();
      break;
      }
    case TK_PENCILDOWN:{
      jj_consume_token(TK_PENCILDOWN);
      jj_consume_token(TK_LPAR);
      jj_consume_token(TK_RPAR);
pendown();
      break;
      }
    case TK_MOVE:{
      jj_consume_token(TK_MOVE);
      jj_consume_token(TK_LPAR);
      value = Exp();
      jj_consume_token(TK_COMMA);
      value2 = Exp();
      jj_consume_token(TK_RPAR);
setxy(value,value2);
      break;
      }
    case TK_CURVE:{
      jj_consume_token(TK_CURVE);
      jj_consume_token(TK_LPAR);
      value = Exp();
      jj_consume_token(TK_COMMA);
      value2 = Exp();
      jj_consume_token(TK_RPAR);
arc(value,value2);
      break;
      }
    case TK_HOME:{
      jj_consume_token(TK_HOME);
      jj_consume_token(TK_LPAR);
      jj_consume_token(TK_RPAR);
home();
      break;
      }
    default:
      jj_la1[6] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void Funcion() throws ParseException {
    jj_consume_token(TK_ID);
    jj_consume_token(TK_LPAR);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TK_LBRACKET:
    case TK_CTE_I:
    case TK_ID:{
      Exp();
      label_5:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case TK_COMMA:{
          ;
          break;
          }
        default:
          jj_la1[7] = jj_gen;
          break label_5;
        }
        jj_consume_token(TK_COMMA);
        Exp();
      }
      break;
      }
    default:
      jj_la1[8] = jj_gen;
      ;
    }
    jj_consume_token(TK_RPAR);
  }

  final public int Exp() throws ParseException {int resultado; int term;
    resultado = Termino();
    label_6:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TK_PLUS:
      case TK_MINUS:{
        ;
        break;
        }
      default:
        jj_la1[9] = jj_gen;
        break label_6;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TK_PLUS:{
        jj_consume_token(TK_PLUS);
        term = Termino();
resultado += term;
        break;
        }
      case TK_MINUS:{
        jj_consume_token(TK_MINUS);
        term = Termino();
resultado -= term;
        break;
        }
      default:
        jj_la1[10] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
{if ("" != null) return resultado;}
        boolEsToken = 0;
    throw new Error("Missing return statement in function");
  }

  final public int Termino() throws ParseException {int resultado; int fact;
    resultado = Factor();
    label_7:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TK_MULT:
      case TK_DIV:{
        ;
        break;
        }
      default:
        jj_la1[11] = jj_gen;
        break label_7;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TK_MULT:{
        jj_consume_token(TK_MULT);
        fact = Factor();
resultado *= fact;
        break;
        }
      case TK_DIV:{
        jj_consume_token(TK_DIV);
        fact = Factor();
resultado /= fact;
        break;
        }
      default:
        jj_la1[12] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
{if ("" != null) return resultado;}
    throw new Error("Missing return statement in function");
  }

  final public int Factor() throws ParseException {Token t;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TK_ID:{
      // Si el token es variable, sacar su valor de la tabla
              t = jj_consume_token(TK_ID);
if (insideWhile == 1)
                {
                        boolEsToken = 1;
                }
                if (variableLocal == 0)
                        {
                                {if ("" != null) return TablaVariables.getValor(t);}
                        }
                else if (variableLocal == 1)
                        {
                                {if ("" != null) return TablaVariablesLocal.getValor(t);}
                        }
      break;
      }
    case TK_LBRACKET:{
      jj_consume_token(TK_LBRACKET);
      Exp();
      jj_consume_token(TK_RBRACKET);
      break;
      }
    case TK_CTE_I:{
      // Si es constante, hacer parse a entero
              t = jj_consume_token(TK_CTE_I);
if (insideWhile == 1)
                {
                        boolEsToken = 0;
                }
{if ("" != null) return Integer.parseInt( t.image );}
      break;
      }
    default:
      jj_la1[13] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public void Asignacion() throws ParseException {Token var; int valor;
    var = jj_consume_token(TK_ID);
    jj_consume_token(TK_EQ);
    valor = Exp();
if (variableLocal == 0)
                        {
                                if (insideWhile == 1)
                                {
                                        TablaBools.asignarValor(var.image, valor);
                                }

                                TablaVariables.asignarValor(var,valor);
                        }
                else if (variableLocal == 1)
                        {
                                if (insideWhile == 1)
                                {
                                        TablaBools.asignarValor(var.image, valor);
                                }

                                TablaVariablesLocal.asignarValor(var,valor, nombreFuncActual);
                        }
  }

  final public int Bool() throws ParseException {int resultado; int exp;
    resultado = Exp();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TK_NE:
    case TK_LT:
    case TK_GT:{
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TK_LT:{
//si el primer valor en la condicion es un id lo guardamos en la tabla de bools
                        if (boolEsToken == 1 && insideWhile == 1)
                        {
                                if (variableLocal == 0)
                                {
                                        nombre = TablaVariables.getKey(resultado);
                                }
                                else if (variableLocal == 1)
                                {
                                        nombre = TablaVariablesLocal.getKey(resultado);
                                }

                                TablaBools.asignarValor(nombre, resultado);
                        }
                        else
                        {
                                TablaBools.asignarValor(nombre, resultado);
                        }
        op = jj_consume_token(TK_LT);
        exp = Exp();
//si el segundo valor en la condicion es un id lo guardamos en la tabla de bools
                        if (boolEsToken == 1 && insideWhile == 1)
                        {
                                if (variableLocal == 0)
                                {
                                        nombre2 = TablaVariables.getKey(exp);
                                }
                                else if (variableLocal == 1)
                                {
                                        nombre2 = TablaVariablesLocal.getKey(exp);
                                }

                                TablaBools.asignarValor(nombre2, exp);
                        }
                        else
                        {
                                TablaBools.asignarValor(nombre2, exp);
                        }
if(resultado >= exp) {resultado =  0;}
        break;
        }
      case TK_GT:{
//si el primer valor en la condicion es un id lo guardamos en la tabla de bools
                        if (boolEsToken == 1 && insideWhile == 1)
                        {
                                if (variableLocal == 0)
                                {
                                        nombre = TablaVariables.getKey(resultado);
                                }
                                else if (variableLocal == 1)
                                {
                                        nombre = TablaVariablesLocal.getKey(resultado);
                                }

                                TablaBools.asignarValor(nombre, resultado);
                        }
                        else
                        {
                                TablaBools.asignarValor(nombre, resultado);
                        }
        op = jj_consume_token(TK_GT);
        exp = Exp();
//si el segundo valor en la condicion es un id lo guardamos en la tabla de bools
                        if (boolEsToken == 1 && insideWhile == 1)
                        {
                                if (variableLocal == 0)
                                {
                                        nombre2 = TablaVariables.getKey(exp);
                                }
                                else if (variableLocal == 1)
                                {
                                        nombre2 = TablaVariablesLocal.getKey(exp);
                                }

                                TablaBools.asignarValor(nombre2, exp);
                        }
                        else
                        {
                                TablaBools.asignarValor(nombre2, exp);
                        }
if(resultado <= exp) {resultado =  0;}
        break;
        }
      case TK_NE:{
//si el primer valor en la condicion es un id lo guardamos en la tabla de bools
                        if (boolEsToken == 1 && insideWhile == 1)
                        {
                                if (variableLocal == 0)
                                {
                                        nombre = TablaVariables.getKey(resultado);
                                }
                                else if (variableLocal == 1)
                                {
                                        nombre = TablaVariablesLocal.getKey(resultado);
                                }

                                TablaBools.asignarValor(nombre, resultado);
                        }
                        else
                        {
                                TablaBools.asignarValor(nombre, resultado);
                        }
        op = jj_consume_token(TK_NE);
        exp = Exp();
//si el segundo valor en la condicion es un id lo guardamos en la tabla de bools
                        if (boolEsToken == 1 && insideWhile == 1)
                        {
                                if (variableLocal == 0)
                                {
                                        nombre2 = TablaVariables.getKey(exp);
                                }
                                else if (variableLocal == 1)
                                {
                                        nombre2 = TablaVariablesLocal.getKey(exp);
                                }

                                TablaBools.asignarValor(nombre2, exp);
                        }
                        else
                        {
                                TablaBools.asignarValor(nombre2, exp);
                        }
if(resultado == exp) {resultado =  0;}
        break;
        }
      default:
        jj_la1[14] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    default:
      jj_la1[15] = jj_gen;
      ;
    }
{if ("" != null) return resultado;}
    throw new Error("Missing return statement in function");
  }

  final public void Secuencia() throws ParseException {
    jj_consume_token(TK_LBRACE);
    if (jj_2_1(2)) {
      Funcion();
    } else if (jj_2_2(2)) {
      Func();
    } else {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TK_WHILE:{
        While();
        break;
        }
      case TK_ID:{
        Asignacion();
        break;
        }
      case TK_IF:{
        Condicion();
        break;
        }
      default:
        jj_la1[16] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    label_8:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TK_COMMA:{
        ;
        break;
        }
      default:
        jj_la1[17] = jj_gen;
        break label_8;
      }
      jj_consume_token(TK_COMMA);
      if (jj_2_3(2)) {
        Funcion();
      } else if (jj_2_4(2)) {
        Func();
      } else {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case TK_WHILE:{
          While();
          break;
          }
        case TK_ID:{
          Asignacion();
          break;
          }
        case TK_IF:{
          Condicion();
          break;
          }
        default:
          jj_la1[18] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    }
    jj_consume_token(TK_RBRACE);
variableLocal = 0;
  }

  final public void While() throws ParseException {Token token; int cond; int nom1Val; int nom2Val;
insideWhile = 1;
    jj_consume_token(TK_WHILE);
    jj_consume_token(TK_LPAR);
    cond = Bool();
    jj_consume_token(TK_RPAR);
//ya que no es true ignora la secuencia
                if( cond == 0) { // Si la condición es falsa, 0, leer tokens hasta encontrar "}"

                        token = getNextToken();

                        while (!token.image.equals("}")) {
                                token = getNextToken();
                        }
        }
                else
                {
                        while(cond != 0)
                        {
                                Secuencia();
                                nom1Val = TablaBools.getValor(nombre);
                                nom2Val = TablaBools.getValor(nombre2);
                                System.out.println("1 " + nom1Val);
                                System.out.println("2 " + nom2Val);

                                if (op.equals("<"))
                                {
                                        if (nom1Val >= nom2Val)
                                        {
                                                cond = 0;
                                        }
                                        else
                                        {
                                                cond = 1;
                                        }
                                }
                                else if (op.image.equals(">"))
                                {
                                        if (nom1Val <= nom2Val)
                                        {
                                                cond = 0;
                                        }
                                        else
                                        {
                                                cond = 1;
                                        }
                                }
                                else if (op.equals("<>"))
                                {
                                        if (nom1Val == nom2Val)
                                        {
                                                cond = 0;
                                        }
                                        else
                                        {
                                                cond = 1;
                                        }
                                }
                        }
                }
                insideWhile = 0;
  }

  final public void Definicion_Func() throws ParseException {Token var; Token var2; Token var3; int cont;
    jj_consume_token(TK_FUNC);
    var = jj_consume_token(TK_ID);
    jj_consume_token(TK_LPAR);
cont = 0; variableLocal = 1; nombreFuncActual = var;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TK_ID:{
      var2 = jj_consume_token(TK_ID);
cont = 1;
      label_9:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case TK_COMMA:{
          ;
          break;
          }
        default:
          jj_la1[19] = jj_gen;
          break label_9;
        }
        jj_consume_token(TK_COMMA);
        var3 = jj_consume_token(TK_ID);
cont = 2;
if (cont == 2)
                                {
                                        TablaFunciones.asignarFuncionDosParametros(var, var2, var3);
                                }
      }
if (cont == 1)
                        {
                                TablaFunciones.asignarFuncionUnParametro(var, var2);
                        }
      break;
      }
    default:
      jj_la1[20] = jj_gen;
      ;
    }
    jj_consume_token(TK_RPAR);
if(cont == 0)
                {
                        TablaFunciones.asignarFuncionCeroParametros(var);
                }
    Secuencia();
  }

  final public void Condicion() throws ParseException {Token token; int cond;
    jj_consume_token(TK_IF);
    jj_consume_token(TK_LPAR);
    cond = Bool();
    jj_consume_token(TK_RPAR);
if( cond == 0) { // Si la condición es falsa, 0, leer tokens hasta encontrar "}"

                        token = getNextToken();

                        while (!token.image.equals("}")) {
                                token = getNextToken();
                        }
        }
        else {
                Secuencia();
        }
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TK_ELSE:{
      jj_consume_token(TK_ELSE);
if( cond != 0) { // Si la condición es verdad, no 0, leer tokens hasta encontrar "}"

                                token = getNextToken();

                            while (!token.image.equals("}")) {
                                token = getNextToken();
                            }
                }
                else {
                        Secuencia();
                }
      break;
      }
    default:
      jj_la1[21] = jj_gen;
      ;
    }
  }

  final public void Arreglo() throws ParseException {
    jj_consume_token(TK_ARR);
    jj_consume_token(TK_ID);
    jj_consume_token(TK_LBRACKET);
    Exp();
    jj_consume_token(TK_RBRACKET);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TK_EQ:{
      jj_consume_token(TK_EQ);
      jj_consume_token(TK_LPAR);
      Exp();
      label_10:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case TK_COMMA:{
          ;
          break;
          }
        default:
          jj_la1[22] = jj_gen;
          break label_10;
        }
        jj_consume_token(TK_COMMA);
        Exp();
      }
      jj_consume_token(TK_RPAR);
      break;
      }
    default:
      jj_la1[23] = jj_gen;
      ;
    }
  }

  private boolean jj_2_1(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  private boolean jj_2_2(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  private boolean jj_2_3(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_3(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  private boolean jj_2_4(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_4(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(3, xla); }
  }

  private boolean jj_3R_12()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_13()) {
    jj_scanpos = xsp;
    if (jj_3R_14()) {
    jj_scanpos = xsp;
    if (jj_3R_15()) {
    jj_scanpos = xsp;
    if (jj_3R_16()) {
    jj_scanpos = xsp;
    if (jj_3R_17()) {
    jj_scanpos = xsp;
    if (jj_3R_18()) {
    jj_scanpos = xsp;
    if (jj_3R_19()) {
    jj_scanpos = xsp;
    if (jj_3R_20()) {
    jj_scanpos = xsp;
    if (jj_3R_21()) {
    jj_scanpos = xsp;
    if (jj_3R_22()) return true;
    }
    }
    }
    }
    }
    }
    }
    }
    }
    return false;
  }

  private boolean jj_3R_16()
 {
    if (jj_scan_token(TK_INPUT)) return true;
    if (jj_scan_token(TK_LPAR)) return true;
    return false;
  }

  private boolean jj_3R_17()
 {
    if (jj_scan_token(TK_PRINT)) return true;
    if (jj_scan_token(TK_LPAR)) return true;
    return false;
  }

  private boolean jj_3R_22()
 {
    if (jj_scan_token(TK_HOME)) return true;
    if (jj_scan_token(TK_LPAR)) return true;
    return false;
  }

  private boolean jj_3R_15()
 {
    if (jj_scan_token(TK_RIGHT)) return true;
    if (jj_scan_token(TK_LPAR)) return true;
    return false;
  }

  private boolean jj_3R_11()
 {
    if (jj_scan_token(TK_ID)) return true;
    if (jj_scan_token(TK_LPAR)) return true;
    return false;
  }

  private boolean jj_3R_21()
 {
    if (jj_scan_token(TK_CURVE)) return true;
    if (jj_scan_token(TK_LPAR)) return true;
    return false;
  }

  private boolean jj_3R_14()
 {
    if (jj_scan_token(TK_LEFT)) return true;
    if (jj_scan_token(TK_LPAR)) return true;
    return false;
  }

  private boolean jj_3R_20()
 {
    if (jj_scan_token(TK_MOVE)) return true;
    if (jj_scan_token(TK_LPAR)) return true;
    return false;
  }

  private boolean jj_3R_13()
 {
    if (jj_scan_token(TK_FORWARD)) return true;
    if (jj_scan_token(TK_LPAR)) return true;
    return false;
  }

  private boolean jj_3_4()
 {
    if (jj_3R_12()) return true;
    return false;
  }

  private boolean jj_3R_19()
 {
    if (jj_scan_token(TK_PENCILDOWN)) return true;
    if (jj_scan_token(TK_LPAR)) return true;
    return false;
  }

  private boolean jj_3R_18()
 {
    if (jj_scan_token(TK_PENCILUP)) return true;
    if (jj_scan_token(TK_LPAR)) return true;
    return false;
  }

  private boolean jj_3_3()
 {
    if (jj_3R_11()) return true;
    return false;
  }

  private boolean jj_3_2()
 {
    if (jj_3R_12()) return true;
    return false;
  }

  private boolean jj_3_1()
 {
    if (jj_3R_11()) return true;
    return false;
  }

  /** Generated Token Manager. */
  public maguTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private Token jj_scanpos, jj_lastpos;
  private int jj_la;
  private int jj_gen;
  final private int[] jj_la1 = new int[24];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x0,0x8000,0x4000,0x0,0x8000000,0x0,0x7fe,0x4000000,0x80400000,0x18000000,0x18000000,0x60000000,0x60000000,0x80400000,0xe0000,0xe0000,0x1800,0x4000000,0x1800,0x4000000,0x0,0x2000,0x4000000,0x10000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x1,0x0,0x0,0x3,0x0,0x3,0x0,0x0,0x1,0x0,0x0,0x0,0x0,0x1,0x0,0x0,0x1,0x0,0x1,0x0,0x1,0x0,0x0,0x0,};
   }
  final private JJCalls[] jj_2_rtns = new JJCalls[4];
  private boolean jj_rescan = false;
  private int jj_gc = 0;

  /** Constructor with InputStream. */
  public magu(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public magu(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new maguTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public magu(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new maguTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public magu(maguTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(maguTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  @SuppressWarnings("serial")
  static private final class LookaheadSuccess extends java.lang.Error { }
  final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;
  private int[] jj_lasttokens = new int[100];
  private int jj_endpos;

  private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      jj_entries_loop: for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              continue jj_entries_loop;
            }
          }
          jj_expentries.add(jj_expentry);
          break jj_entries_loop;
        }
      }
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[38];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 24; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 38; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

  private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 4; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
            case 2: jj_3_3(); break;
            case 3: jj_3_4(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

                  //variable de Bool() para comparador

}
