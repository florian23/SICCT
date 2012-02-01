package sicct.command;

public class CommandAPDU extends APDU{

	private Header header;
	
	private Body body;
	
	public CommandAPDU(Header header, Body body) {
		super();
		this.header = header;
		this.body = body;
	}

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}
}
