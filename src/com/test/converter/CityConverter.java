package com.test.converter;


import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("com.test.converter.CityConverter")
public class CityConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		System.out.println(value);
		State state=new State();
		state.setId(1);
		state.setName("ABC");
		return state;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		State state=(State)value;
		return state.getName();
	}

	


}
