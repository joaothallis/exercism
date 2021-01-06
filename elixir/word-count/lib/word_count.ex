defmodule WordCount do
  @doc """
  Count the number of words in the sentence.

  Words are compared case-insensitively.
  """
  @spec count(String.t()) :: map
  def count(sentence) do
    sentence
    |> String.replace(~w(: ! & @ $ % ^ &), "")
    |> String.downcase()
    |> String.split([" ", ",", "_"], trim: true)
    |> Enum.frequencies()
  end
end
