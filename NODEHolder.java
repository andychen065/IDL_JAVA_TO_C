
/**
* NODEHolder.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��test.idl
* 2019��10��9�� ������ ����10ʱ05��37�� CST
*/

public final class NODEHolder implements org.omg.CORBA.portable.Streamable
{
  public NODE value = null;

  public NODEHolder ()
  {
  }

  public NODEHolder (NODE initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NODEHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NODEHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NODEHelper.type ();
  }

}
