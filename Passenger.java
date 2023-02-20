
public class Passenger {

	public String pname;
	public String pdate;
	public String pclass;
	public String psource;
	public String pdestination;
	public int id;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdate() {
		return pdate;
	}
	public void setPdate(String pdate) {
		this.pdate = pdate;
	}
	public String getPclass() {
		return pclass;
	}
	public void setPclass(String pclass) {
		this.pclass = pclass;
	}
	public String getPsource() {
		return psource;
	}
	public void setPsource(String psource) {
		this.psource = psource;
	}
	public String getPdestination() {
		return pdestination;
	}
	public void setPdestination(String pdestination) {
		this.pdestination = pdestination;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Passenger(String pname, String pdate, String pclass, String psource, String pdestination, int id) {
		super();
		this.pname = pname;
		this.pdate = pdate;
		this.pclass = pclass;
		this.psource = psource;
		this.pdestination = pdestination;
		this.id = id;
	}
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
