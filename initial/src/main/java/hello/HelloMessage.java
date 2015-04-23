package hello;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class HelloMessage
{
	public abstract String getName();

	@JsonCreator
	public static HelloMessage create(@JsonProperty(value = "name") String name)
	{
		return new AutoValue_HelloMessage(name);
	}
}
