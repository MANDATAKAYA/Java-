package 様々なデータ型とキャスト;

public class Test {
 public static void main(String[] args) {
  int iNum = 5;
  float fNum = 3.4f;
  double dNum = 7.9;
  if (iNum > 5) {
  iNum = fNum; // line 1 
  } else {
  fNum = dNum; // line 2 
  } 
 }
}
//このコードをコンパイルおよび実行すると、どのような結果になりますか？
//３、line 1およびline 2でコンパイル・エラーが発生する。