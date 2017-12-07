package facttorytim;

public class AkreditacijaUslovi implements IAkreditaciajaUslovi {
	
	private Laboratorija lab;
	private Bodovi bod;
	
	public AkreditacijaUslovi() {
		// TODO Auto-generated constructor stub
	}
	public Laboratorija getLab() {
		return lab;
	}
	public void setLab(Laboratorija lab) {
		this.lab = lab;
	}
	public Bodovi getBod() {
		return bod;
	}
	public void setBod(Bodovi bod) {
		this.bod = bod;
	}
	
	

}
