package edu.common.dynamicextensions.domain.nui;

import edu.common.dynamicextensions.napi.ControlValue;

public class EnableAction extends SkipAction {
	@Override
	public void perform(ControlValue fieldValue) {
		fieldValue.setReadOnly(false);

	}

	@Override
	public void reset(ControlValue fieldValue) {
		fieldValue.setReadOnly(true);
	}
}
