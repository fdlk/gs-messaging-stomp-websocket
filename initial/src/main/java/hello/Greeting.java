package hello;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Greeting
{
	public abstract String getContent();

	@JsonCreator
	public static Greeting create(@JsonProperty(value = "content") String content)
	{
		return new AutoValue_Greeting(content);
	}
}
