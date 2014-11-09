package com.devesion.obd.command.diagnostic.sensors;

import com.devesion.obd.command.diagnostic.sensors.units.SensorCommandValue;
import com.devesion.obd.shared.ObdNumberedEnum;

/**
 * Reads current MAF value.
 */
public class MassAirFlowCommand extends AbstractSensorCommand {

	@Override
	public ObdNumberedEnum getPid() {
		return SensorCommandPids.MASS_AIR_FLOW;
	}

	@Override
	public SensorCommandValue getValue() {
		return getUnitFactory().createAirFlowValue(getResult());
	}
}
