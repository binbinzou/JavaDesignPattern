package com.self.design.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ProtoType implements Cloneable , Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String string;
	
	private SerializableObject object;
	
	public Object clone (){
		ProtoType protoType = null;
		try {
			protoType = (ProtoType) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return protoType;
	}
	
	public Object deepClone(){
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream stream = null;
		try {
			stream = new ObjectOutputStream(bos);
			stream.writeObject(this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(bis);
			return ois.readObject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}	
	
	
}

class SerializableObject implements Serializable {  
    private static final long serialVersionUID = 1L;  
}  

