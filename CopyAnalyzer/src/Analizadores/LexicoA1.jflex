package Analizadores;
import java_cup.runtime.Symbol; 


%%

%class LexicoA1
%public 
%line
%char
%cup
%unicode
%ignorecase

%init{
    yyline=1;
    yychar=1;
%init}

blancos=[ \r\t]+
cadena=[\"][^\"\n]*[\"]
decimal=[0-9]+("."[ |0-9]+)?
variable=[a-zA-Z]([0-9]|[a-zA-Z]|"_")*
comentarioo=("##")(.)*(\n)
comentarioomu=("#""*"[^"*"]*"*""#")

%%

"generarreporteestadistico"          {return new Symbol(sym.generarreporteestadistico,yyline,yychar,yytext());}
"definirglobales"                    {return new Symbol(sym.definirglobales,yyline,yychar,yytext());}
"compare"                            {return new Symbol(sym.compare,yyline,yychar,yytext());}
"graficabarras"                      {return new Symbol(sym.graficabarras,yyline,yychar,yytext());}
"graficapie"                         {return new Symbol(sym.graficapie,yyline,yychar,yytext());}
"graficalineas"                      {return new Symbol(sym.graficalineas,yyline,yychar,yytext());}
"puntajeespecífico"                  {return new Symbol(sym.puntajeespecífico,yyline,yychar,yytext());}

"string"                            {return new Symbol(sym.sstring,yyline,yychar,yytext());}
"double"                            {return new Symbol(sym.ddouble,yyline,yychar,yytext());}
"titulo"                            {return new Symbol(sym.titulo,yyline,yychar,yytext());}
"valores"                           {return new Symbol(sym.valores,yyline,yychar,yytext());}
"ejex"                              {return new Symbol(sym.ejex,yyline,yychar,yytext());}
"titulox"                            {return new Symbol(sym.titulox,yyline,yychar,yytext());}
"tituloy"                            {return new Symbol(sym.tituloy,yyline,yychar,yytext());}
"archivo"                            {return new Symbol(sym.archivo,yyline,yychar,yytext());}

"{"                                  {return new Symbol(sym.llavea,yyline,yychar,yytext());}
"}"                                  {return new Symbol(sym.llavec,yyline,yychar,yytext());}
"("                                  {return new Symbol(sym.parentesisa,yyline,yychar,yytext());}
")"                                  {return new Symbol(sym.parentesisc,yyline,yychar,yytext());}
"["                                  {return new Symbol(sym.corchetea,yyline,yychar,yytext());}
"]"                                  {return new Symbol(sym.corchetec,yyline,yychar,yytext());}
","                                  {return new Symbol(sym.coma,yyline,yychar,yytext());}
";"                                  {return new Symbol(sym.pcoma,yyline,yychar,yytext());}
":"                                  {return new Symbol(sym.dpuntos,yyline,yychar,yytext());}
"="                                  {return new Symbol(sym.igual,yyline,yychar,yytext());}
"$"                                 {return new Symbol(sym.dolar,yyline,yychar,yytext());}

\n                                  {yychar=1;}

{blancos}                           {}
{cadena}                            {return new Symbol(sym.cadena,yyline,yychar,yytext());}
{decimal}                           {return new Symbol(sym.decimal,yyline,yychar,yytext());}
{variable}                           {return new Symbol(sym.variable,yyline,yychar,yytext());}
{comentarioo}                           {return new Symbol(sym.comentarioo,yyline,yychar,yytext());}
{comentarioomu}                           {return new Symbol(sym.comentarioomu,yyline,yychar,yytext());}

. {
    System.out.println("Este es un error lexico: "+yytext()+", en la linea: "+yyline+", en la columna: "+yychar);
}

