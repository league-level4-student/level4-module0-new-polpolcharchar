package _04_Data_Type_Option_Pane;

import javax.swing.JOptionPane;

public class DataTypeOptionPane {
    public static void main(String[] args) {

        DataType[] dataTypes = DataType.values();
        
        int result = JOptionPane.showOptionDialog(null, null, "", 0, 0, null, dataTypes, 0);
        
        
        switch (result) {
        
        case 0:{
        	System.out.println("The byte has a minimum value of -128 and a maximum value of 127. It can hold " + dataTypes[result].getBits() + " bits");
        	break;
        }
        case 1:{
        	System.out.println("The short has a minimum value of -32,768 and a maximum value of 32,767. It can hold " + dataTypes[result].getBits() + " bits");
        	break;
        }
        case 2:{
        	System.out.println("The int has a minimum value of -2^31 and a maximum value of 2^31-1. It can hold " + dataTypes[result].getBits() + " bits");
        	break;
        }
        case 3:{
        	System.out.println("The long has a minimum value of -2^63 and a maximum value of 2^63-1. It can hold " + dataTypes[result].getBits() + " bits");
        	break;
        }
        case 4:{
        	System.out.println("The float has a range of values beyond the scope of this discussion. It can hold " + dataTypes[result].getBits() + " bits");
        	break;
        }
        case 5:{
        	System.out.println("The double has a range of values is beyond the scope of this discussion. It can hold " + dataTypes[result].getBits() + " bits");
        	break;
        }
        case 6:{
        	System.out.println("The boolean has only two possible values: true and false. It can hold " + dataTypes[result].getBits() + " bits");
        	break;
        }
        case 7:{
        	System.out.println("The char has a minimum value of '\\u0000' (or 0) and a maximum value of '\\uffff' (or 65,535 inclusive). It can hold " + dataTypes[result].getBits() + " bits");
        	break;
        }
        
        
        
        }
    }
    
    
    
    enum DataType {
    	Byte(8), Short(16), Int(32), Long(64), Float(32), Double(64), Boolean(1), Char(16);
    	
    	private final int bits;
    	
    	private DataType(int bits) {
    		this.bits = bits;
    	}
    	
    	private int getBits() {
    		return this.bits;
    	}
    	
    	
    }
}
