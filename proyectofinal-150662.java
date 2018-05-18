%% ESTE ES UN JUEGO DE ADIVINA QUIEN, EN LA PRIMERA PARTE SE PRESENTA LA BASE DE
%% CONOCIMIENTOS, SE DESCRIBE A LOS PERSONAJES DE LO GENERAL A LO ESPECIFICO,
%% DESPUES SE PRESENTA EL CONJUNTO DE REGLAS ASI COMO NUEVAS INFERENCIAS BASADAS
%% EN LA BASE DE CONOCIMIENTOS, POR ULTIMO SE PRESENTAN EJEMPLOS DE COMO DESPUES
%% DE AGREGAR CIERTAS CARACTERISTICAS AL PERSONAJE A ADIVINAR, EL PROGRAMA ADIVINA
%% EN QUE PERSONAJE ESTAMOS PENSANDO

%% PERSONAJES %%

% ¿El personaje es hombre o mujer? 

mujer("Marilyn Monroe").
mujer("Frida Kahlo").
mujer("Reina Isabel II").
mujer("Teresa de Calcuta").
mujer("Malala Yousafzai").
mujer("Oprah Winfrey").
mujer("Cleopatra").
mujer("Princesa Diana de Gales").
hombre("Charles Chaplin").
hombre("Adolf Hitler").
hombre("Abraham Lincoln").
hombre("Che Guevara").
hombre("Mahatma Gandhi").
hombre("Jesucristo").
hombre("Salvador Dalí").
hombre("Donald Trump").
hombre("Enrique Peña Nieto").
hombre("Justin Bieber").


%% CARACTERISTICAS %%

% ¿Está vivo el personaje? 

estatus(fallecido, "Marilyn Monroe").
estatus(fallecido, "Frida Kahlo").
estatus(vivo, "Reina Isabel II").
estatus(fallecido, "Teresa de Calcuta").
estatus(vivo, "Malala Yousafzai").
estatus(vivo, "Oprah Winfrey").
estatus(fallecido, "Cleopatra").
estatus(fallecido, "Princesa Diana de Gales").
estatus(fallecido, "Charles Chaplin").
estatus(fallecido, "Adolf Hitler").
estatus(fallecido, "Abraham Lincoln").
estatus(fallecido, "Che Guevara").
estatus(fallecido, "Mahatma Gandhi").
estatus(vivo, "Stephen Hawking").
estatus(fallecido, "Albert Einstein").
estatus(fallecido, "Jesucristo").
estatus(fallecido, "Salvador Dalí").
estatus(vivo, "Donald Trump").
estatus(vivo, "Enrique Peña Nieto").
estatus(vivo, "Justin Bieber").

% ¿El personaje es conocido por ser religioso?

-religioso("Marilyn Monroe").
-religioso("Frida Kahlo").
-religioso("Reina Isabel II").
religioso("Teresa de Calcuta").
-religioso("Malala Yousafzai").
-religioso("Oprah Winfrey").
-religioso("Cleopatra").
-religioso("Princesa Diana de Gales").
-religioso("Charles Chaplin").
-religioso("Adolf Hitler").
-religioso("Abraham Lincoln").
-religioso("Che Guevara").
religioso("Mahatma Gandhi").
-religioso("Stephen Hawking").
-religioso("Albert Einstein").
religioso("Jesucristo").
-religioso("Salvador Dalí").
-religioso("Donald Trump").
-religioso("Enrique Peña Nieto").
-religioso("Justin Bieber").

% ¿El personaje es conocido por ser de la política / realeza?

-realpolitic("Marilyn Monroe").
-realpolitic("Frida Kahlo").
realpolitic("Reina Isabel II").
-realpolitic("Teresa de Calcuta").
-realpolitic("Malala Yousafzai").
-realpolitic("Oprah Winfrey").
realpolitic("Cleopatra").
realpolitic("Princesa Diana de Gales").
-realpolitic("Charles Chaplin").
realpolitic("Adolf Hitler").
realpolitic("Abraham Lincoln").
realpolitic("Che Guevara").
-realpolitic("Mahatma Gandhi").
-realpolitic("Stephen Hawking").
-realpolitic("Albert Einstein").
-realpolitic("Jesucristo").
-realpolitic("Salvador Dalí").
realpolitic("Donald Trump").
realpolitic("Enrique Peña Nieto").
-realpolitic("Justin Bieber").


% ¿El personaje es conocido por algún talento relacionado con el entretenimiento? (pintar, cantar, actuar)

talento("Marilyn Monroe").
talento("Frida Kahlo").
-talento("Reina Isabel II").
-talento("Teresa de Calcuta").
-talento("Malala Yousafzai").
talento("Oprah Winfrey").
-talento("Cleopatra").
-talento("Princesa Diana de Gales").
talento("Charles Chaplin").
-talento("Adolf Hitler").
-talento("Abraham Lincoln").
-talento("Che Guevara").
-talento("Mahatma Gandhi").
-talento("Stephen Hawking").
-talento("Albert Einstein").
-talento("Jesucristo").
talento("Salvador Dalí").
-talento("Donald Trump").
-talento("Enrique Peña Nieto").
talento("Justin Bieber").

% ¿El personaje es joven? / ¿El personaje es viejo?

joven("Marilyn Monroe").
joven("Frida Kahlo").
viejo("Reina Isabel II").
viejo("Teresa de Calcuta").
joven("Malala Yousafzai").
viejo("Oprah Winfrey").
joven("Cleopatra").
joven("Princesa Diana de Gales").
viejo("Charles Chaplin").
viejo("Adolf Hitler").
viejo("Abraham Lincoln").
joven("Che Guevara").
viejo("Mahatma Gandhi").
viejo("Stephen Hawking").
viejo("Albert Einstein").
joven("Jesucristo").
viejo("Salvador Dalí").
viejo("Donald Trump").
joven("Enrique Peña Nieto").
joven("Justin Bieber").


% ¿El personaje es científico?

-cientifico("Marilyn Monroe").
-cientifico("Frida Kahlo").
-cientifico("Reina Isabel II").
-cientifico("Teresa de Calcuta").
-cientifico("Malala Yousafzai").
-cientifico("Oprah Winfrey").
-cientifico("Cleopatra").
-cientifico("Princesa Diana de Gales").
-cientifico("Charles Chaplin").
-cientifico("Adolf Hitler").
-cientifico("Abraham Lincoln").
-cientifico("Che Guevara").
-cientifico("Mahatma Gandhi").
cientifico("Stephen Hawking").
cientifico("Albert Einstein").
-cientifico("Jesucristo").
-cientifico("Salvador Dalí").
-cientifico("Donald Trump").
-cientifico("Enrique Peña Nieto").
-cientifico("Justin Bieber").

% ¿El personaje tiene bigote?

-bigote("Marilyn Monroe").
bigote("Frida Kahlo").
-bigote("Reina Isabel II").
-bigote("Teresa de Calcuta").
-bigote("Malala Yousafzai").
-bigote("Oprah Winfrey").
-bigote("Cleopatra").
-bigote("Princesa Diana de Gales").
bigote("Charles Chaplin").
bigote("Adolf Hitler").
-bigote("Abraham Lincoln").
bigote("Che Guevara").
bigote("Mahatma Gandhi").
-bigote("Stephen Hawking").
bigote("Albert Einstein").
bigote("Jesucristo").
bigote("Salvador Dalí").
-bigote("Donald Trump").
-bigote("Enrique Peña Nieto").
-bigote("Justin Bieber").

% ¿De qué continente es el personaje?

america("Marilyn Monroe").
america("Frida Kahlo").
europa("Reina Isabel II").
asia("Teresa de Calcuta").
asia("Malala Yousafzai").
america("Oprah Winfrey").
africa("Cleopatra").
europa("Princesa Diana de Gales").
europa("Charles Chaplin").
europa("Adolf Hitler").
america("Abraham Lincoln").
america("Che Guevara").
asia("Mahatma Gandhi").
europa("Stephen Hawking").
europa("Albert Einstein").
asia("Jesucristo").
europa("Salvador Dalí").
america("Donald Trump").
america("Enrique Peña Nieto").
america("Justin Bieber").

%% REGLAS %%

:- mujer(X), hombre(X). % Un personaje es o mujer u hombre

:- joven(X), viejo(X). % No podemos tener un mundo en el que un joven sea viejo y viceversa

hombre(X) :-
	cientifico(X). % si es científico inferimos que es hombre

profeta(X) :-
	not mujer(X), 
	religioso(X),
	joven(X),
	asia(X). % si no es mujer, es religioso, es joven y proviene de asia inferimos que es un profeta

realeza(X) :-
	mujer(X),
	realpolitic(X),
	europa(X). % si es una mujer proveniente de Europa y está relacionada con la política inferimos que es de la realeza

presidente(X) :-
	realpolitic(X),
	america(X),
	-bigote(X). % si es un político de América que no tiene bigote es presidente


% Aquí vamos a adivinar al personaje:

%% MARILYN MONROE %%
personaje(X) :-
	mujer(X), % ¿El personaje es hombre o mujer? 
	estatus(fallecido, X), % ¿Está vivo el personaje?
	-religioso(X), % ¿El personaje es conocido por ser religioso?
	-realpolitic(X), % ¿El personaje es conocido por ser de la política / realeza?
	talento(X), % ¿El personaje es conocido por algún talento relacionado con el entretenimiento? (pintar, cantar, actuar)
	joven(X), % ¿El personaje es joven o viejo?
	-cientifico(X), % ¿El personaje es científico?
	-bigote(X), % ¿El personaje tiene bigote?
	america(X). % ¿De qué continente es el personaje?
	

%% REINA ISABEL %%
personaje(X) :-
	realeza(X), % ¿El personaje es de la realeza?
	viejo(X). % ¿El personaje es viejo?

%% JESUCRISTO %%
personaje(X) :-
	profeta(X), % ¿El personaje es un profeta?
	estatus(fallecido, X). % ¿El personaje ya falleció?

%% DONALD TRUMP %%
personaje(X) :-
	presidente(X), % ¿El personaje es presidente?
	estatus(vivo, X), % ¿El personaje está vivo?
	viejo(X). % ¿El personaje es viejo?























