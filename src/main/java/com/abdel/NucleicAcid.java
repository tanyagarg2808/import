package com.abdel;


public class NucleicAcid {
	private String name;
	private String chemicalFormula;
	private float molarmass;
	private float density;
	
	NucleicAcid(String name, String formula, float mass, float density){
		setName(name);
		setChemicalFormula(formula);
		setMolarmass(mass);
		setDensity(density);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setChemicalFormula(String chemicalFormula) {
		this.chemicalFormula = chemicalFormula;
	}
	public void setMolarmass(float molarmass) {
		this.molarmass = molarmass;
	}
	public void setDensity(float density) {
		this.density = density;
	}
	
	public String getName() {
		return name;
	}
	public String getChemicalFormula() {
		return chemicalFormula;
	}
	public float getMolarmass() {
		return molarmass;
	}
	public float getDensity() {
		return density;
	}
	
	public void print(){
		System.out.printf("\nName: %s\n", getName());
		System.out.printf("Chemical Formula: %s\n", getChemicalFormula());
		System.out.printf("Molar mass: %.2f g/mol\n", getMolarmass());
		System.out.printf("Density: %.2f g/cm3\n", getDensity());
	}

}
