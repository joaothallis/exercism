{
  pkgs ? import <nixpkgs> { },
}:
pkgs.mkShell {
  nativeBuildInputs = with pkgs.buildPackages; [
    exercism
    erlang
    elixir
    go
    gotools
  ];
}
