package com.devesion.obd.command.protocol;

public class SetEchoCommandTest extends AbstractSetStateCommandTest {

	@Override
	protected String getOperandPrefix() {
		return "E";
	}

	@Override
	protected ProtocolCommand createCommand(boolean state) {
		return new SetEchoCommand(state);
	}
}