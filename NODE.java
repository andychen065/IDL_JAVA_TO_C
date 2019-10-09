
/**
* NODE.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��test.idl
* 2019��10��9�� ������ ����10ʱ05��37�� CST
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
