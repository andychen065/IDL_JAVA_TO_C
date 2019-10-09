
/**
* NODESHelper.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从test.idl
* 2019年10月9日 星期三 下午10时05分37秒 CST
*/

abstract public class NODESHelper
{
  private static String  _id = "IDL:NODES:1.0";

  public static void insert (org.omg.CORBA.Any a, NODE[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static NODE[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = NODEHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (NODESHelper.id (), "NODES", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static NODE[] read (org.omg.CORBA.portable.InputStream istream)
  {
    NODE value[] = null;
    int _len0 = istream.read_long ();
    value = new NODE[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = NODEHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, NODE[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      NODEHelper.write (ostream, value[_i0]);
  }

}
