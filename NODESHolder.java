
/**
* NODESHolder.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从test.idl
* 2019年10月9日 星期三 下午10时05分37秒 CST
*/

public final class NODESHolder implements org.omg.CORBA.portable.Streamable
{
  public NODE value[] = null;

  public NODESHolder ()
  {
  }

  public NODESHolder (NODE[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NODESHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NODESHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NODESHelper.type ();
  }

}
