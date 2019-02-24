/**
 * 
 */
package Team76.Controller;

/**
 * @author Janani Anand
 *
 */
public class DetailsEntity {

	String quiztitle;
	String qinstruct;
	String qtype;
	
	public String getQuiztitle() {
		return quiztitle;
	}

	public void setQuiztitle(String quiztitle) {
		this.quiztitle = quiztitle;
	}

	public String getQinstruct() {
		return qinstruct;
	}

	public void setQinstruct(String qinstruct) {
		this.qinstruct = qinstruct;
	}

	public String getQtype() {
		return qtype;
	}

	public void setQtype(String qtype) {
		this.qtype = qtype;
	}

	public DetailsEntity() {
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
         return "DetailsEntity [quiztitle=" + quiztitle + ", qinstruct=" + qinstruct + ", qtype=" +qtype+	"]";	
	}

}
