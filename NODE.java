
/**
* NODE.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从test.idl
* 2019年10月9日 星期三 下午10时05分37秒 CST
*/

public final class NODE implements org.omg.CORBA.portable.IDLEntity
{
  public double dx = (double)0;
  public double dy = (double)0;
  public String sz = null;
  public char ca = (char)0;
  public int lb = (int)0;
  public boolean bc = false;

  public NODE ()
  {
  } // ctor

  public NODE (double _dx, double _dy, String _sz, char _ca, int _lb, boolean _bc)
  {
    dx = _dx;
    dy = _dy;
    sz = _sz;
    ca = _ca;
    lb = _lb;
    bc = _bc;
  } // ctor

} // class NODE
