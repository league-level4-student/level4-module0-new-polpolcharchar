package _01_Encapsulate_the_Data;

public class EncapsulateTheData {

    /*
     * itemsReceived cannot negative. All negative parameters should set
     * itemsReceived to 0.
     */

    private int itemsReceived;
    
    int getItemsReceived() {
    	return itemsReceived;
    }
    
    void setItemsReceived(int value) {
    	if(value < 0) {
    		itemsReceived = 0;
    	}else {
    		itemsReceived = value;
    	}
    }

    /*
     * degreesTurned must be locked between 0.0 and 360.0 inclusive. All
     * parameters outside this range should set degreesTurned to the nearest
     * bound.
     */

    private double degreesTurned;
    
    double getDegreesTurned() {
    	return degreesTurned;
    }
    
    void setDegreesTurned(double value) {
    	
    	if(value < 0) {
    		degreesTurned = 0;
    	}else if(value > 360) {
    		degreesTurned = 360;
    	}else {
    		degreesTurned = value;
    	}
    	
    }
    
    

    /*
     * nomenclature must not contain an empty String. An empty String parameter
     * should set nomenclature to a String with a single space.
     */

    private String nomenclature;
    
    String getNomenclature() {
    	return nomenclature;
    }
    
    void setNomenclature(String value) {
    	if(value.equals("")) {
    		nomenclature = " ";
    	}else {
    		nomenclature = value;
    	}
    }

    /*
     * memberObj must not be a String. A String parameter should set memberObj
     * to a new Object(); Hint: Use the instanceof operator.
     */

    private Object memberObj;
    
    Object getMemberObj() {
    	return memberObj;
    }
    
    void setMemberObj(Object value) {
    	if(value instanceof String) {
    		memberObj = new Object();
    	}else {
    		memberObj = value;
    	}
    }

}
