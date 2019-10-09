import java.lang.reflect.Field;



public class Main {
	private static final String strIndent = "	";
	public static void main(String[] args) throws ClassNotFoundException {
		
		
        Class c = Class.forName("NODE");
        
        String strClassName = c.getSimpleName();
        Field[] f = c.getDeclaredFields();
        
        //pass cJSON * root, Target arrays
        System.out.print("void parse" + c.getSimpleName() + "(cJSON* root," + strClassName.toLowerCase()+ "s" + ")");
        System.out.println("{");
        System.out.println(strIndent + "int size = cJSON_GetArraySize(root);");
        System.out.println(strIndent + "funds->length(size);");
        System.out.println(strIndent + "int i=0;");
        System.out.println(strIndent + "cJSON * single = NULL;");
        System.out.println(strIndent + "cJSON_ArrayForEach(single, root)");
        System.out.println(strIndent + "{");
        
        System.out.println(strIndent + strIndent + "idl::NODE node = new idl::NODE;");
        
        for(Field fie : f){
            String fieldname = fie.getName();
            String fieldtype = fie.getType().toString();
            
            switch (fieldtype) {
			case "double":
			case "int":
			case "long":
			case "boolean":
				System.out.println(strIndent + strIndent + "int " + fieldname + " = cJSON_GetObjectItemCaseSensitive( single , \"" + fieldname + "\")->valueint ;");
				System.out.println(strIndent + strIndent + "node->" + fieldname + " = " + fieldname + ";");
				break;
			case "char":
				System.out.println(strIndent + strIndent + "CString " + fieldname + " = cJSON_GetObjectItemCaseSensitive( single , \"" + fieldname + "\")->valuestring ;");
				System.out.println(strIndent + strIndent + "node->" + fieldname + " = " + fieldname + "[0];");
				break;

			default:
				break;
			}
            
            System.out.println();
            
        }
        System.out.println(strIndent + strIndent + "nodes[i++]=node");
        System.out.println(strIndent + "}");
        System.out.println(strIndent + "cJSON_Delete(root);");
        System.out.println("}");
	}
	
	
	//provide class output path and the target class or package
	//e.g. output:D:\Eova\workspace\test\bin, target:  node or * or com.java.xxx.* or com.java.xxx.node
	
	//scan and load class, then add into the classes list
	
	//parse each class
	
	//output each parseXXX function with c lang
}
