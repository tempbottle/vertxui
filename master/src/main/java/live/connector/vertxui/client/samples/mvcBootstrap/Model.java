package live.connector.vertxui.client.samples.mvcBootstrap;

import java.util.Date;

public class Model {
	public Date date;
	public Name who;
	public int amount;
	public String notes;

	public enum Name {
		Linda, Niels
	}

}