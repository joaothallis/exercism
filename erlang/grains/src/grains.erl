-module(grains).

-export([square/1, total/0]).


square(Square) ->
    InitialSquare = 1,
    GrainsInInitialSquare = 1,
    grains_in_square(InitialSquare, GrainsInInitialSquare, Square).

total() ->
    18446744073709551615.

grains_in_square(Grains, SquareAcc, Square)  ->
    if Square < 1 orelse Square > 64 ->
            {error, "square must be between 1 and 64"};
       SquareAcc >= Square ->
            Grains;
       true ->
            grains_in_square(Grains * 2, SquareAcc + 1, Square)
end.
