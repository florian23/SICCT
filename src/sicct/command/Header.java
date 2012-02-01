package sicct.command;

public class Header {
	
	protected byte CLASS;
	
	protected byte INSTRUCTION;
	
	protected byte P1;
	
	protected byte P2;

	public Header(byte cLASS, byte iNSTRUCTION, byte p1, byte p2) {
		super();
		CLASS = cLASS;
		INSTRUCTION = iNSTRUCTION;
		P1 = p1;
		P2 = p2;
	}

	public byte getCLASS() {
		return CLASS;
	}

	public void setCLASS(byte cLASS) {
		CLASS = cLASS;
	}

	public byte getINSTRUCTION() {
		return INSTRUCTION;
	}

	public void setINSTRUCTION(byte iNSTRUCTION) {
		INSTRUCTION = iNSTRUCTION;
	}

	public byte getP1() {
		return P1;
	}

	public void setP1(byte p1) {
		P1 = p1;
	}

	public byte getP2() {
		return P2;
	}

	public void setP2(byte p2) {
		P2 = p2;
	}

}
