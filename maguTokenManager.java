/* maguTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. maguTokenManager.java */

/** Token Manager. */
@SuppressWarnings("unused")public class maguTokenManager implements maguConstants {

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0xf000L) != 0L)
         {
            jjmatchedKind = 30;
            return 27;
         }
         if ((active0 & 0x10000L) != 0L)
         {
            jjmatchedKind = 1;
            return 5;
         }
         return -1;
      case 1:
         if ((active0 & 0x1d000L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 1;
            return 27;
         }
         if ((active0 & 0x2000L) != 0L)
            return 27;
         return -1;
      case 2:
         if ((active0 & 0x8000L) != 0L)
            return 27;
         if ((active0 & 0x15000L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 2;
            return 27;
         }
         return -1;
      case 3:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 3;
            return 27;
         }
         if ((active0 & 0x14000L) != 0L)
            return 27;
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 13:
         return jjMoveStringLiteralDfa1_0(0x200000000L);
      case 40:
         return jjStopAtPos(0, 21);
      case 41:
         return jjStopAtPos(0, 22);
      case 42:
         return jjStopAtPos(0, 28);
      case 43:
         return jjStopAtPos(0, 26);
      case 44:
         return jjStopAtPos(0, 25);
      case 45:
         return jjStopAtPos(0, 27);
      case 47:
         return jjStopAtPos(0, 29);
      case 60:
         jjmatchedKind = 19;
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 61:
         return jjStopAtPos(0, 17);
      case 62:
         return jjStopAtPos(0, 20);
      case 91:
         return jjStopAtPos(0, 23);
      case 93:
         return jjStopAtPos(0, 24);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      default :
         return jjMoveNfa_0(6, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 10:
         if ((active0 & 0x200000000L) != 0L)
            return jjStopAtPos(1, 33);
         break;
      case 62:
         if ((active0 & 0x40000L) != 0L)
            return jjStopAtPos(1, 18);
         break;
      case 102:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(1, 13, 27);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000L);
      case 114:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(2, 15, 27);
         break;
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 99:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(3, 16, 27);
         break;
      case 101:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(3, 14, 27);
         break;
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(4, 12, 27);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 77;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 6:
               case 28:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 31)
                     kind = 31;
                  { jjCheckNAdd(28); }
                  break;
               case 5:
               case 27:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 30)
                     kind = 30;
                  { jjCheckNAdd(27); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 6:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 30)
                        kind = 30;
                     { jjCheckNAdd(27); }
                  }
                  if (curChar == 112)
                     { jjAddStates(0, 3); }
                  else if (curChar == 99)
                     { jjAddStates(4, 6); }
                  else if (curChar == 104)
                     { jjAddStates(7, 9); }
                  else if (curChar == 115)
                     { jjAddStates(10, 11); }
                  else if (curChar == 109)
                  {
                     if (kind > 6)
                        kind = 6;
                  }
                  else if (curChar == 114)
                  {
                     if (kind > 3)
                        kind = 3;
                  }
                  else if (curChar == 108)
                  {
                     if (kind > 2)
                        kind = 2;
                  }
                  else if (curChar == 102)
                  {
                     if (kind > 1)
                        kind = 1;
                  }
                  if (curChar == 99)
                  {
                     if (kind > 11)
                        kind = 11;
                  }
                  else if (curChar == 104)
                  {
                     if (kind > 9)
                        kind = 9;
                  }
                  else if (curChar == 109)
                     jjstateSet[jjnewStateCnt++] = 21;
                  else if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 16;
                  else if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 10;
                  else if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 5:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 30)
                        kind = 30;
                     { jjCheckNAdd(27); }
                  }
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 0:
                  if (curChar == 100 && kind > 1)
                     kind = 1;
                  break;
               case 1:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 2:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 3:
                  if (curChar == 119)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 4:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 7:
                  if (curChar == 102 && kind > 1)
                     kind = 1;
                  break;
               case 8:
                  if (curChar == 116 && kind > 2)
                     kind = 2;
                  break;
               case 9:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 10:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 11:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if (curChar == 108 && kind > 2)
                     kind = 2;
                  break;
               case 13:
                  if (curChar == 116 && kind > 3)
                     kind = 3;
                  break;
               case 14:
                  if (curChar == 104)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 15:
                  if (curChar == 103)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 16:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 17:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 18:
                  if (curChar == 114 && kind > 3)
                     kind = 3;
                  break;
               case 19:
                  if (curChar == 101 && kind > 6)
                     kind = 6;
                  break;
               case 20:
                  if (curChar == 118)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 21:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 22:
                  if (curChar == 109)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 23:
                  if (curChar == 109 && kind > 6)
                     kind = 6;
                  break;
               case 24:
                  if (curChar == 104 && kind > 9)
                     kind = 9;
                  break;
               case 25:
                  if (curChar == 99 && kind > 11)
                     kind = 11;
                  break;
               case 26:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 30)
                     kind = 30;
                  { jjCheckNAdd(27); }
                  break;
               case 27:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 30)
                     kind = 30;
                  { jjCheckNAdd(27); }
                  break;
               case 29:
                  if (curChar == 115)
                     { jjAddStates(10, 11); }
                  break;
               case 30:
                  if (curChar == 115 && kind > 7)
                     kind = 7;
                  break;
               case 31:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 32:
                  if (curChar == 112)
                     jjstateSet[jjnewStateCnt++] = 31;
                  break;
               case 33:
                  if (curChar == 119)
                     jjstateSet[jjnewStateCnt++] = 32;
                  break;
               case 34:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 33;
                  break;
               case 35:
                  if (curChar == 104)
                     jjstateSet[jjnewStateCnt++] = 34;
                  break;
               case 36:
                  if (curChar == 112 && kind > 7)
                     kind = 7;
                  break;
               case 37:
                  if (curChar == 104)
                     { jjAddStates(7, 9); }
                  break;
               case 38:
                  if (curChar == 115 && kind > 8)
                     kind = 8;
                  break;
               case 39:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 38;
                  break;
               case 40:
                  if (curChar == 112)
                     jjstateSet[jjnewStateCnt++] = 39;
                  break;
               case 41:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 40;
                  break;
               case 42:
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 41;
                  break;
               case 43:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 42;
                  break;
               case 44:
                  if (curChar == 112 && kind > 8)
                     kind = 8;
                  break;
               case 45:
                  if (curChar == 101 && kind > 9)
                     kind = 9;
                  break;
               case 46:
                  if (curChar == 109)
                     jjstateSet[jjnewStateCnt++] = 45;
                  break;
               case 47:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 46;
                  break;
               case 48:
                  if (curChar == 99)
                     { jjAddStates(4, 6); }
                  break;
               case 49:
                  if (curChar == 101 && kind > 10)
                     kind = 10;
                  break;
               case 50:
                  if (curChar == 118)
                     jjstateSet[jjnewStateCnt++] = 49;
                  break;
               case 51:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 50;
                  break;
               case 52:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 51;
                  break;
               case 53:
                  if (curChar == 118 && kind > 10)
                     kind = 10;
                  break;
               case 54:
                  if (curChar == 114 && kind > 11)
                     kind = 11;
                  break;
               case 55:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 54;
                  break;
               case 56:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 55;
                  break;
               case 57:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 56;
                  break;
               case 58:
                  if (curChar == 112)
                     { jjAddStates(0, 3); }
                  break;
               case 59:
                  if (curChar == 112 && kind > 4)
                     kind = 4;
                  break;
               case 60:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 59;
                  break;
               case 61:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 60;
                  break;
               case 62:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 61;
                  break;
               case 63:
                  if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 62;
                  break;
               case 64:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 63;
                  break;
               case 65:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 64;
                  break;
               case 66:
                  if (curChar == 117 && kind > 4)
                     kind = 4;
                  break;
               case 67:
                  if (curChar == 110 && kind > 5)
                     kind = 5;
                  break;
               case 68:
                  if (curChar == 119)
                     jjstateSet[jjnewStateCnt++] = 67;
                  break;
               case 69:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 68;
                  break;
               case 70:
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 69;
                  break;
               case 71:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 70;
                  break;
               case 72:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 71;
                  break;
               case 73:
                  if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 72;
                  break;
               case 74:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 73;
                  break;
               case 75:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 74;
                  break;
               case 76:
                  if (curChar == 100 && kind > 5)
                     kind = 5;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 77 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   65, 66, 75, 76, 52, 53, 57, 43, 44, 47, 35, 36, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, 
"\167\150\151\154\145", "\151\146", "\145\154\163\145", "\141\162\162", "\146\165\156\143", "\75", 
"\74\76", "\74", "\76", "\50", "\51", "\133", "\135", "\54", "\53", "\55", "\52", "\57", 
null, null, null, null, null, };
static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100000200L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         TokenLexicalActions(matchedToken);
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 1 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                                 System.out.println("TK_FWD -> " + image);
         break;
      case 2 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                                         System.out.println("TK_LEFT -> " + image);
         break;
      case 3 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                                         System.out.println("TK_RIGHT -> " + image);
         break;
      case 4 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                                 System.out.println("TK_PENCILUP -> " + image);
         break;
      case 5 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                         System.out.println("TK_PENCILDOWN -> " + image);
         break;
      case 6 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                                         System.out.println("TK_MOVE -> " + image);
         break;
      case 7 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                                 System.out.println("TK_SHOWPOS -> " + image);
         break;
      case 8 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                                 System.out.println("TK_HIDEPOS -> " + image);
         break;
      case 9 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                                         System.out.println("TK_HOME -> " + image);
         break;
      case 10 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                                 System.out.println("TK_CURVE -> " + image);
         break;
      case 11 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                                 System.out.println("TK_CLEAR -> " + image);
         break;
      case 12 :
        image.append(jjstrLiteralImages[12]);
        lengthOfMatch = jjstrLiteralImages[12].length();
                                                                         System.out.println("TK_WHILE -> " + image);
         break;
      case 13 :
        image.append(jjstrLiteralImages[13]);
        lengthOfMatch = jjstrLiteralImages[13].length();
                                                                                 System.out.println("TK_IF -> " + image);
         break;
      case 14 :
        image.append(jjstrLiteralImages[14]);
        lengthOfMatch = jjstrLiteralImages[14].length();
                                                                         System.out.println("TK_ELSE -> " + image);
         break;
      case 15 :
        image.append(jjstrLiteralImages[15]);
        lengthOfMatch = jjstrLiteralImages[15].length();
                                                                                 System.out.println("TK_ARR -> " + image);
         break;
      case 16 :
        image.append(jjstrLiteralImages[16]);
        lengthOfMatch = jjstrLiteralImages[16].length();
                                                                         System.out.println("TK_FUNC -> " + image);
         break;
      case 17 :
        image.append(jjstrLiteralImages[17]);
        lengthOfMatch = jjstrLiteralImages[17].length();
                                                                                 System.out.println("TK_EQ -> " + image);
         break;
      case 18 :
        image.append(jjstrLiteralImages[18]);
        lengthOfMatch = jjstrLiteralImages[18].length();
                                                                                 System.out.println("TK_NE -> " + image);
         break;
      case 19 :
        image.append(jjstrLiteralImages[19]);
        lengthOfMatch = jjstrLiteralImages[19].length();
                                                                                 System.out.println("TK_LT -> " + image);
         break;
      case 20 :
        image.append(jjstrLiteralImages[20]);
        lengthOfMatch = jjstrLiteralImages[20].length();
                                                                                 System.out.println("TK_GT -> " + image);
         break;
      case 21 :
        image.append(jjstrLiteralImages[21]);
        lengthOfMatch = jjstrLiteralImages[21].length();
                                                                                 System.out.println("TK_LPAR -> " + image);
         break;
      case 22 :
        image.append(jjstrLiteralImages[22]);
        lengthOfMatch = jjstrLiteralImages[22].length();
                                                                                 System.out.println("TK_RPAR -> " + image);
         break;
      case 23 :
        image.append(jjstrLiteralImages[23]);
        lengthOfMatch = jjstrLiteralImages[23].length();
                                                                         System.out.println("TK_LBRACKET -> " + image);
         break;
      case 24 :
        image.append(jjstrLiteralImages[24]);
        lengthOfMatch = jjstrLiteralImages[24].length();
                                                                         System.out.println("TK_RBRACKET -> " + image);
         break;
      case 25 :
        image.append(jjstrLiteralImages[25]);
        lengthOfMatch = jjstrLiteralImages[25].length();
                                                                                 System.out.println("TK_COMMA -> " + image);
         break;
      case 26 :
        image.append(jjstrLiteralImages[26]);
        lengthOfMatch = jjstrLiteralImages[26].length();
                                                                                 System.out.println("TK_PLUS -> " + image);
         break;
      case 27 :
        image.append(jjstrLiteralImages[27]);
        lengthOfMatch = jjstrLiteralImages[27].length();
                                                                                 System.out.println("TK_MINUS -> " + image);
         break;
      case 28 :
        image.append(jjstrLiteralImages[28]);
        lengthOfMatch = jjstrLiteralImages[28].length();
                                                                                 System.out.println("TK_MULT -> " + image);
         break;
      case 29 :
        image.append(jjstrLiteralImages[29]);
        lengthOfMatch = jjstrLiteralImages[29].length();
                                                                                 System.out.println("TK_DIV -> " + image);
         break;
      case 30 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                                                                 System.out.println("TK_ID -> " + image);
         break;
      case 31 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                 System.out.println("TK_CTE_I -> " + image);
         break;
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

    /** Constructor. */
    public maguTokenManager(SimpleCharStream stream){

      if (input_stream != null)
        throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);

    input_stream = stream;
  }

  /** Constructor. */
  public maguTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream)
  {
    jjmatchedPos = jjnewStateCnt = 0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  static private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 77; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream, int lexState)
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  static public void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xffffffffL, 
};
static final long[] jjtoSkip = {
   0x700000000L, 
};
    static protected SimpleCharStream  input_stream;

    static private final int[] jjrounds = new int[77];
    static private final int[] jjstateSet = new int[2 * 77];

    private static final StringBuilder jjimage = new StringBuilder();
    private static StringBuilder image = jjimage;
    private static int jjimageLen;
    private static int lengthOfMatch;
    
    static protected char curChar;
}