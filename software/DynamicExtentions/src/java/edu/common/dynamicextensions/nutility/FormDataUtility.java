
package edu.common.dynamicextensions.nutility;

import java.util.List;

import edu.common.dynamicextensions.domain.nui.Control;
import edu.common.dynamicextensions.domain.nui.Label;
import edu.common.dynamicextensions.domain.nui.SubFormControl;
import edu.common.dynamicextensions.napi.ControlValue;
import edu.common.dynamicextensions.napi.FormData;

public class FormDataUtility {

	public static void evaluateSkipLogic(FormData formData) {
		evaluateSkipLogic(formData, formData, true);
	}

	/**
	 * Evaluates skip logic for all the controls 
	 * @param tgtCtlFormData containing target control value
	 * @param srcCtlFormData containing source control value
	 * @param evaulateSubform to decide whether next level subform skip logic is to be evaluated or not
	 */
	private static void evaluateSkipLogic(FormData tgtCtlFormData, FormData srcCtlFormData, boolean evaulateSubform) {
		for (Control control : tgtCtlFormData.getContainer().getControls()) {
			ControlValue controlValue = tgtCtlFormData.getFieldValue(control.getName());

			if (control.isSkipLogicTargetControl()) {
				control.evaluateSkipLogic(controlValue, srcCtlFormData);
			}

			if (control instanceof SubFormControl && evaulateSubform) {
				evaluateSubformSkipLogic((SubFormControl) control, controlValue, srcCtlFormData);
			}
		}

	}

	private static void evaluateSubformSkipLogic(SubFormControl subFormControl, ControlValue controlValue,
			FormData srcCtlFormData) {
		if (controlValue.getValue() != null && ((List<FormData>) controlValue.getValue()).size() > 0) {
			List<FormData> formDatas = (List<FormData>) controlValue.getValue();

			if (subFormControl.isCardinalityOneToMany()) {

				for (FormData data : formDatas) {
					evaluateSkipLogic(data, data, false);
				}
			} else {
				evaluateSkipLogic(formDatas.get(0), srcCtlFormData, false);
			}

		}
	}

	public static int getEmptyControlCount(FormData formData) {
		int countrolCount = 0;
		evaluateSkipLogic(formData);

		for (Control control : formData.getContainer().getControls()) {
			ControlValue fieldValue = formData.getFieldValue(control.getName());
			if (control instanceof Label) {
				continue;
			}
			if (!fieldValue.isHidden() && !fieldValue.isReadOnly() && fieldValue.isEmpty() == true) {
				countrolCount++;
			}
		}
		return countrolCount;
	}

	public static int getFilledControlCount(FormData formData) {
		int countrolCount = 0;
		evaluateSkipLogic(formData);

		for (Control control : formData.getContainer().getControls()) {
			ControlValue fieldValue = formData.getFieldValue(control.getName());

			if (!fieldValue.isHidden() && !fieldValue.isReadOnly()) {
				countrolCount++;
			}
		}
		return countrolCount;
	}

}