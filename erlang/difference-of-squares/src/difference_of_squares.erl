-module(difference_of_squares).

-export([sum_of_squares/1, square_of_sum/1, difference_of_squares/1, test_version/0]).

sum_of_squares(N) ->
    trunc((N * (N+1)*(2*N+1))/6).
square_of_sum(N) ->
    trunc(math:pow((math:pow(N,2)+N)/2,2)).

difference_of_squares(N) ->
     square_of_sum(N)-sum_of_squares(N).

test_version() ->
    1.
