# observer-pattern
Example of Observer Pattern
Weather Station Example

Weather subject is kind of publisher which can register , remove and notify observers.

WeatherData implements weather subject so as to notify all changes in properties
like temperature, pressure and humidity are notified to all it's subscribers.

CurrentConditionsDisplay and ForecastDisplay are observers that want to be notified
of any changes in weather data, they also implement Display Element to display their
relevant information.
