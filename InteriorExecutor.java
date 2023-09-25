/*class InteriorExecutor{

	public static void main(String args[]){
	 Interior mat = new Interior();
	 mat.addMaterial("Door");
	 mat.addMaterial("Window");
	 mat.addMaterial("Sofa");
	 mat.addMaterial("Furnituure");
	 mat.addMaterial("wall");
	 mat.addMaterial("fan");
	 mat.addMaterial("Stand Fan");
	 mat.addMaterial("Kitchen iteam");
	 mat.addMaterial("Granite");
	 mat.addMaterial("Tiles");
	 mat.addMaterial("Cabord");
	 
	 
	 
			mat.getMaterial();
	 
	  
	 
	
	}

}*/






class InteriorExecutor{

public static void main(String args[]){
 
 Interior material = new Interior();
 
 material.addMaterialName("Wood" );
 material.addMaterialName("Bulbs");
 material.addMaterialName("glass");
 material.addMaterialName("metal");
 material.addMaterialName("tile");
 material.addMaterialName("ceramic");
 material.addMaterialName("plastic");
 material.addMaterialName("brass");
 material.addMaterialName("plywood");
 material.addMaterialName("copper");
 material.addMaterialName("copper");
 
 material.getMaterialNames();
 
 boolean variable = material.deleteByName("tile");


}
}