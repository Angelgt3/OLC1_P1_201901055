package Analizadores.A2;
import java_cup.runtime.Symbol; 

%%

%class LexicoA2
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
caracter=[\'][^\'\n]?[\']
decimal=[0-9]+("."[ |0-9]+)?
id=[a-zA-ZÀ-ÿ\u00f1\u00d1]([0-9]|[a-zA-ZÀ-ÿ\u00f1\u00d1]|"_")*
comentarioo=("//")(.)*(\n)
comentarioomu=("/""*"[^"*"]*"*""/")
igualacion=("=""=")
diferencia=("!""=")
maigual=(">""=")
meigual=("<""=")
andd=("&""&")
orr=("|""|")

    
%%

"class"           {return new Symbol(sym.classe,yyline,yychar,yytext());}
"var"             {return new Symbol(sym.var,yyline,yychar,yytext());}
"let"             {return new Symbol(sym.let,yyline,yychar,yytext());}
"const"           {return new Symbol(sym.constt,yyline,yychar,yytext());}
"true"            {return new Symbol(sym.truee,yyline,yychar,yytext());}
"false"           {return new Symbol(sym.falsee,yyline,yychar,yytext());}
"if"              {return new Symbol(sym.iff,yyline,yychar,yytext());}
"else"            {return new Symbol(sym.elsee,yyline,yychar,yytext());}
"for"             {return new Symbol(sym.forr,yyline,yychar,yytext());}
"while"           {return new Symbol(sym.whilee,yyline,yychar,yytext());}
"do"              {return new Symbol(sym.doo,yyline,yychar,yytext());}
"switch"          {return new Symbol(sym.switchh,yyline,yychar,yytext());}
"case"            {return new Symbol(sym.casee,yyline,yychar,yytext());}
"break"           {return new Symbol(sym.breakk,yyline,yychar,yytext());}
"default"         {return new Symbol(sym.defaultt,yyline,yychar,yytext());}
"console"         {return new Symbol(sym.console,yyline,yychar,yytext());}
"log"             {return new Symbol(sym.log,yyline,yychar,yytext());}
"require"         {return new Symbol(sym.require,yyline,yychar,yytext());}


"{"                                  {return new Symbol(sym.llavea,yyline,yychar,yytext());}
"}"                                  {return new Symbol(sym.llavec,yyline,yychar,yytext());}
"("                                  {return new Symbol(sym.parentesisa,yyline,yychar,yytext());}
")"                                  {return new Symbol(sym.parentesisc,yyline,yychar,yytext());}
"."                                  {return new Symbol(sym.punto,yyline,yychar,yytext());}
","                                  {return new Symbol(sym.coma,yyline,yychar,yytext());}
";"                                  {return new Symbol(sym.pcoma,yyline,yychar,yytext());}
"="                                  {return new Symbol(sym.igual,yyline,yychar,yytext());}
":"                                  {return new Symbol(sym.dpuntos,yyline,yychar,yytext());}
"!"                                  {return new Symbol(sym.not,yyline,yychar,yytext());}
"<"                                  {return new Symbol(sym.menor,yyline,yychar,yytext());}
">"                                  {return new Symbol(sym.mayor,yyline,yychar,yytext());}
"+"                                  {return new Symbol(sym.suma,yyline,yychar,yytext());}
"-"                                  {return new Symbol(sym.resta,yyline,yychar,yytext());}
"*"                                  {return new Symbol(sym.multiplicacion,yyline,yychar,yytext());}
"/"                                  {return new Symbol(sym.division,yyline,yychar,yytext());}
"%"                                  {return new Symbol(sym.modulo,yyline,yychar,yytext());}


\n                                  {yychar=1;}

{blancos}                           {}
{cadena}                            {return new Symbol(sym.cadena,yyline,yychar,yytext());}
{caracter}                           {return new Symbol(sym.caracter,yyline,yychar,yytext());}
{decimal}                           {return new Symbol(sym.decimal,yyline,yychar,yytext());}
{id}                                {return new Symbol(sym.id,yyline,yychar,yytext());}
{comentarioo}                       {return new Symbol(sym.comentarioo,yyline,yychar,yytext());}
{comentarioomu}                     {return new Symbol(sym.comentarioomu,yyline,yychar,yytext());}
{igualacion}                            {return new Symbol(sym.igualacion,yyline,yychar,yytext());}
{diferencia}                           {return new Symbol(sym.diferencia,yyline,yychar,yytext());}
{maigual}                            {return new Symbol(sym.maigual,yyline,yychar,yytext());}
{meigual}                           {return new Symbol(sym.meigual,yyline,yychar,yytext());}
{orr}                                {return new Symbol(sym.orr,yyline,yychar,yytext());}
{andd}                                {return new Symbol(sym.andd,yyline,yychar,yytext());}

. {
    System.out.println("Este es un error lexico: "+yytext()+", en la linea: "+yyline+", en la columna: "+yychar);
}