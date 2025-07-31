defmodule Lasagna do
  @expected_minutes_in_oven 40
  @preparation_minutes_per_layer 2

  @type actual_minutes_in_oven :: number
  @type number_of_layers :: number

  @spec expected_minutes_in_oven :: 40
  def expected_minutes_in_oven, do: @expected_minutes_in_oven

  @spec remaining_minutes_in_oven(actual_minutes_in_oven) :: number
  def remaining_minutes_in_oven(actual_minutes_in_oven),
    do: expected_minutes_in_oven() - actual_minutes_in_oven

  @spec preparation_time_in_minutes(number_of_layers) :: number
  def preparation_time_in_minutes(number_of_layers),
    do: number_of_layers * @preparation_minutes_per_layer

  @spec total_time_in_minutes(number_of_layers, actual_minutes_in_oven) :: number
  def total_time_in_minutes(number_of_layers, actual_minutes_in_oven),
    do: actual_minutes_in_oven + preparation_time_in_minutes(number_of_layers)

  @spec alarm :: String.t()
  def alarm, do: "Ding!"
end
