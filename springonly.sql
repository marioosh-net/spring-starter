--
-- PostgreSQL database dump
--

-- Started on 2011-07-21 08:38:37

SET statement_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = off;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET escape_string_warning = off;

--
-- TOC entry 1499 (class 1262 OID 14856634)
-- Name: springonly; Type: DATABASE; Schema: -; Owner: springonly
--

CREATE DATABASE springonly WITH TEMPLATE = template0 ENCODING = 'UNICODE';


ALTER DATABASE springonly OWNER TO springonly;

\connect springonly

SET statement_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = off;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET escape_string_warning = off;

SET search_path = public, pg_catalog;

--
-- TOC entry 17 (class 1255 OID 17230)
-- Dependencies: 4
-- Name: plpgsql_call_handler(); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION plpgsql_call_handler() RETURNS language_handler
    LANGUAGE c
    AS '$libdir/plpgsql', 'plpgsql_call_handler';


ALTER FUNCTION public.plpgsql_call_handler() OWNER TO postgres;

--
-- TOC entry 18 (class 1255 OID 17231)
-- Dependencies: 4
-- Name: plpgsql_validator(oid); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION plpgsql_validator(oid) RETURNS void
    LANGUAGE c
    AS '$libdir/plpgsql', 'plpgsql_validator';


ALTER FUNCTION public.plpgsql_validator(oid) OWNER TO postgres;

--
-- TOC entry 264 (class 16402 OID 17232)
-- Dependencies: 17 18
-- Name: plpgsql; Type: PROCEDURAL LANGUAGE; Schema: public; Owner: postgres
--

CREATE TRUSTED PROCEDURAL LANGUAGE plpgsql HANDLER plpgsql_call_handler VALIDATOR plpgsql_validator;


ALTER PROCEDURAL LANGUAGE plpgsql OWNER TO postgres;

--
-- TOC entry 19 (class 1255 OID 17233)
-- Dependencies: 4
-- Name: database_size(name); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION database_size(name) RETURNS bigint
    LANGUAGE c STRICT
    AS '$libdir/dbsize', 'database_size';


ALTER FUNCTION public.database_size(name) OWNER TO postgres;

--
-- TOC entry 22 (class 1255 OID 17236)
-- Dependencies: 4
-- Name: pg_database_size(oid); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION pg_database_size(oid) RETURNS bigint
    LANGUAGE c STRICT
    AS '$libdir/dbsize', 'pg_database_size';


ALTER FUNCTION public.pg_database_size(oid) OWNER TO postgres;

--
-- TOC entry 32 (class 1255 OID 17246)
-- Dependencies: 4
-- Name: pg_dir_ls(text, boolean); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION pg_dir_ls(text, boolean) RETURNS SETOF text
    LANGUAGE c STRICT
    AS '$libdir/admin', 'pg_dir_ls';


ALTER FUNCTION public.pg_dir_ls(text, boolean) OWNER TO postgres;

--
-- TOC entry 26 (class 1255 OID 17240)
-- Dependencies: 4
-- Name: pg_file_length(text); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION pg_file_length(text) RETURNS bigint
    LANGUAGE sql STRICT
    AS $_$SELECT len FROM pg_file_stat($1) AS s(len int8, c timestamp, a timestamp, m timestamp, i bool)$_$;


ALTER FUNCTION public.pg_file_length(text) OWNER TO postgres;

--
-- TOC entry 27 (class 1255 OID 17241)
-- Dependencies: 4
-- Name: pg_file_read(text, bigint, bigint); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION pg_file_read(text, bigint, bigint) RETURNS text
    LANGUAGE c STRICT
    AS '$libdir/admin', 'pg_file_read';


ALTER FUNCTION public.pg_file_read(text, bigint, bigint) OWNER TO postgres;

--
-- TOC entry 29 (class 1255 OID 17243)
-- Dependencies: 4
-- Name: pg_file_rename(text, text, text); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION pg_file_rename(text, text, text) RETURNS boolean
    LANGUAGE c
    AS '$libdir/admin', 'pg_file_rename';


ALTER FUNCTION public.pg_file_rename(text, text, text) OWNER TO postgres;

--
-- TOC entry 31 (class 1255 OID 17245)
-- Dependencies: 4
-- Name: pg_file_rename(text, text); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION pg_file_rename(text, text) RETURNS boolean
    LANGUAGE sql STRICT
    AS $_$SELECT pg_file_rename($1, $2, NULL); $_$;


ALTER FUNCTION public.pg_file_rename(text, text) OWNER TO postgres;

--
-- TOC entry 25 (class 1255 OID 17239)
-- Dependencies: 4
-- Name: pg_file_stat(text); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION pg_file_stat(text) RETURNS record
    LANGUAGE c STRICT
    AS '$libdir/admin', 'pg_file_stat';


ALTER FUNCTION public.pg_file_stat(text) OWNER TO postgres;

--
-- TOC entry 30 (class 1255 OID 17244)
-- Dependencies: 4
-- Name: pg_file_unlink(text); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION pg_file_unlink(text) RETURNS boolean
    LANGUAGE c STRICT
    AS '$libdir/admin', 'pg_file_unlink';


ALTER FUNCTION public.pg_file_unlink(text) OWNER TO postgres;

--
-- TOC entry 28 (class 1255 OID 17242)
-- Dependencies: 4
-- Name: pg_file_write(text, text, boolean); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION pg_file_write(text, text, boolean) RETURNS bigint
    LANGUAGE c STRICT
    AS '$libdir/admin', 'pg_file_write';


ALTER FUNCTION public.pg_file_write(text, text, boolean) OWNER TO postgres;

--
-- TOC entry 35 (class 1255 OID 17249)
-- Dependencies: 4
-- Name: pg_logdir_ls(); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION pg_logdir_ls() RETURNS SETOF record
    LANGUAGE c STRICT
    AS '$libdir/admin', 'pg_logdir_ls';


ALTER FUNCTION public.pg_logdir_ls() OWNER TO postgres;

--
-- TOC entry 34 (class 1255 OID 17248)
-- Dependencies: 4
-- Name: pg_postmaster_starttime(); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION pg_postmaster_starttime() RETURNS timestamp without time zone
    LANGUAGE c STRICT
    AS '$libdir/admin', 'pg_postmaster_starttime';


ALTER FUNCTION public.pg_postmaster_starttime() OWNER TO postgres;

--
-- TOC entry 23 (class 1255 OID 17237)
-- Dependencies: 4
-- Name: pg_relation_size(oid); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION pg_relation_size(oid) RETURNS bigint
    LANGUAGE c STRICT
    AS '$libdir/dbsize', 'pg_relation_size';


ALTER FUNCTION public.pg_relation_size(oid) OWNER TO postgres;

--
-- TOC entry 33 (class 1255 OID 17247)
-- Dependencies: 4
-- Name: pg_reload_conf(); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION pg_reload_conf() RETURNS integer
    LANGUAGE c STABLE STRICT
    AS '$libdir/admin', 'pg_reload_conf';


ALTER FUNCTION public.pg_reload_conf() OWNER TO postgres;

--
-- TOC entry 24 (class 1255 OID 17238)
-- Dependencies: 4
-- Name: pg_size_pretty(bigint); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION pg_size_pretty(bigint) RETURNS text
    LANGUAGE c STRICT
    AS '$libdir/dbsize', 'pg_size_pretty';


ALTER FUNCTION public.pg_size_pretty(bigint) OWNER TO postgres;

--
-- TOC entry 21 (class 1255 OID 17235)
-- Dependencies: 4
-- Name: pg_tablespace_size(oid); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION pg_tablespace_size(oid) RETURNS bigint
    LANGUAGE c STRICT
    AS '$libdir/dbsize', 'pg_tablespace_size';


ALTER FUNCTION public.pg_tablespace_size(oid) OWNER TO postgres;

--
-- TOC entry 20 (class 1255 OID 17234)
-- Dependencies: 4
-- Name: relation_size(text); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION relation_size(text) RETURNS bigint
    LANGUAGE c STRICT
    AS '$libdir/dbsize', 'relation_size';


ALTER FUNCTION public.relation_size(text) OWNER TO postgres;

--
-- TOC entry 1179 (class 1259 OID 14856640)
-- Dependencies: 4
-- Name: id_seq; Type: SEQUENCE; Schema: public; Owner: springonly
--

CREATE SEQUENCE id_seq
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.id_seq OWNER TO springonly;

--
-- TOC entry 1502 (class 0 OID 0)
-- Dependencies: 1179
-- Name: id_seq; Type: SEQUENCE SET; Schema: public; Owner: springonly
--

SELECT pg_catalog.setval('id_seq', 79, true);


--
-- TOC entry 1177 (class 1259 OID 17250)
-- Dependencies: 1242 4
-- Name: pg_logdir_ls; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW pg_logdir_ls AS
    SELECT a.filetime, a.filename FROM pg_logdir_ls() a(filetime timestamp without time zone, filename text);


ALTER TABLE public.pg_logdir_ls OWNER TO postgres;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 1178 (class 1259 OID 14856635)
-- Dependencies: 1495 4
-- Name: tlink; Type: TABLE; Schema: public; Owner: springonly; Tablespace: 
--

CREATE TABLE tlink (
    address character varying(255),
    name character varying(255),
    description text,
    ldate timestamp without time zone,
    date_mod timestamp without time zone,
    clicks integer,
    id integer DEFAULT nextval('public.id_seq'::text) NOT NULL
);


ALTER TABLE public.tlink OWNER TO springonly;

--
-- TOC entry 1180 (class 1259 OID 14856644)
-- Dependencies: 1178 4
-- Name: tlink_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tlink_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.tlink_id_seq OWNER TO postgres;

--
-- TOC entry 1503 (class 0 OID 0)
-- Dependencies: 1180
-- Name: tlink_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tlink_id_seq OWNED BY tlink.id;


--
-- TOC entry 1504 (class 0 OID 0)
-- Dependencies: 1180
-- Name: tlink_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('tlink_id_seq', 1, false);


--
-- TOC entry 1496 (class 0 OID 14856635)
-- Dependencies: 1178
-- Data for Name: tlink; Type: TABLE DATA; Schema: public; Owner: springonly
--

COPY tlink (address, name, description, ldate, date_mod, clicks, id) FROM stdin;
http://gazeta.pl	Gazeta.pl - Polska i Ĺwiat - wiadomoĹci | informacje | wydarzenia		2011-03-17 09:35:33.078	\N	2	15
http://as			2011-03-18 15:14:34.437	\N	2	37
http://asda			2011-03-18 15:27:07.906	\N	2	40
http://da	as	ds	2011-03-21 08:11:30.319	\N	2	41
http://onet.pl	Onet.pl - Polski Portal Internetowy		2011-03-21 09:01:32.304	\N	2	42
http://wp.pl	Wirtualna Polska - www.wp.pl		2011-03-21 09:07:16.868	\N	2	43
http://gazeta.pl	Gazeta.pl - Polska i świat - wiadomości | informacje | wydarzenia	Serwisy lokalne w 26 miastach. Serwisy tematyczne: sport, rozrywka, zdrowie, kobieta, technologie, praca, pieniądze, biznes, film, muzyka, motoryzacja, radio. Informacje, wydarzenia, blogi, forum. Portal Agory SA.	2011-03-21 09:12:44.299	\N	2	45
http://onet.pl	Onet.pl - Polski Portal Internetowy	Dzisiaj w Onet.pl: wiadomości z kraju i ze świata; biznes, sport, rozrywka i pogoda. Sprawdź pocztę, bloguj, czatuj i umawiaj się na randki.	2011-03-21 09:12:56.297	\N	2	46
http://stackoverflow.com	Stack Overflow		2011-03-21 09:13:06.796	\N	2	47
http://wp.pl	Wirtualna Polska - www.wp.pl		2011-03-17 08:58:15.484	\N	0	1
http://onet.pl	Onet.pl - Polski Portal Internetowy		2011-03-17 08:59:08.89	\N	0	4
http://stackoverflow.com	Stack Overflow		2011-03-17 09:06:47.812	\N	0	5
http://gazeta.pl	Gazeta.pl - Polska i świat - wiadomości | informacje | wydarzenia		2011-03-21 09:07:27.007	\N	5	44
http://google.pl	Google		2011-03-21 09:14:50.159	\N	4	50
http://discovery.com	Discovery Channel : Science, History, Space, Tech, Sharks, News	Discovery Channel online lets you explore science, history, space, tech, sharks, & more, with videos & news, plus exclusives on your favorite TV shows.	2011-03-21 10:34:48.176	\N	16	55
http://morelki.pl			2011-03-21 09:14:31.146	\N	5	48
http://marioosh.net	marioosh.net	marioosh's home page	2011-03-21 09:14:39.676	\N	8	49
http://viva.pl	Viva! - Ekskluzywny magazyn o gwiazdach.	Viva! - Ekskluzywny magazyn o gwiazdach. Serwis poświęcony plotkom i ploteczkom o gwiazdach, ich życiu, miłości, rolach, filmach, romansach, skandalach, stylu. Wiadomości z życia gwiazd, celebrities i ludzi show-biznesu, wywiady ze znanymi i sławnymi ludźmi.	2011-03-21 09:15:00.252	\N	8	51
http://kalfior.com			2011-03-21 14:34:40.38	\N	0	56
http://home.pl	home.pl : Nr 1 w Polsce. Hosting, domeny, darmowe strony, poczta e-mail	Home.pl to numer 1 w polskim hostingu. Oferta zawiera niezawodny hosting, domeny, serwery dedykowane i sklepy internetowe.	2011-03-21 14:34:47.802	\N	0	57
http://localhost:8081/linkownia-springonly/index.html#		Linkownia - przechowalnia linków	2011-03-21 14:35:54.333	\N	0	59
http://domeny.pl	Domeny.pl - rejestracja Domeny za 0 zł, serwery za 0 zł, Domeny za darmo	Domeny.pl - rejestracja domeny, serwery. Domeny: pl, eu, com, org, net. Domeny i serwery. Rejestracja domen. Wycena domen. Tanie domeny eu, com, net, info, org. Tanie domeny mobi i tel. Wycena domen i certyfikaty ssl. Nowość na rynku - certyfikat EV SSL. Tanie certyfikaty SSL od 99 zl.	2011-03-21 15:02:06.192	\N	0	61
http://nazwa.pl	Domeny: rejestracja domen, giełda domen, serwery i Strony WWW - nazwa.pl	Domeny, serwery, strony www oraz profesjonalny hosting w nazwa.pl. Teraz w promocji możesz mieć atrakcyjny adres www, serwer i Stronę WWW zupełnie za darmo.	2011-03-21 15:02:11.77	\N	0	62
http://linkownia.marioosh.net			2011-03-21 14:35:08.63	\N	1	58
http://serverfault.com	Server Fault		2011-03-21 14:36:08.473	\N	1	60
http://onet.pl	Onet.pl - Polski Portal Internetowy	Dzisiaj w Onet.pl: wiadomości z kraju i ze świata; biznes, sport, rozrywka i pogoda. Sprawdź pocztę, bloguj, czatuj i umawiaj się na randki.	2011-03-21 15:28:29.161	\N	0	63
http://top.pl	top.pl		2011-03-21 15:28:35.473	\N	0	64
http://model.pl	Modelgroup.com | Home (pl)		2011-03-21 15:28:40.38	\N	0	65
http://askme.com	Askme - India's leading local search engine. Over 3 million businesses listed on Askme	Askme is a Infomedia's local search service that helps users find comprehensive and updated information on local business and services in Ahmedabad, Bangalore, Bhopal, Chennai, Coimbatore, Delhi NCR, Hyderabad, Indore, Jaipur, Kochi, Kolkata, Lucknow, Ludhiana, Mumbai, Nagpur, Nashik, Pune, Rajkot, Surat, Vadodara, Visakhapatnam (Vizag) and more. Over 3 million businesses in listed.	2011-03-21 15:28:49.223	\N	0	66
http://sing.com			2011-03-21 15:29:05.88	\N	0	67
http://mtv.com	Dostêp zabroniony		2011-03-21 15:29:10.677	\N	0	68
http://edytagorniak.com			2011-03-21 15:29:23.442	\N	1	69
http://wikipedia.pl	Wikipedia.pl - Wyszukiwarka polskiej Wikipedii	Wyszukiwarka polskiej Wikipedii.	2011-03-21 15:29:38.02	\N	0	70
http://radiozet.pl	Radio ZET - Czujesz i Wiesz - wiadomości, muzyka, świat, rozrywka, konkursy, koncerty na żywo, kanały internetowe	Radio ZET.      Radio ZET. Czujesz i Wiesz - to pierwsze źródło informacji. Najświeższe wiadomości, nowości muzyczne, Lista Przebojów. Niezwykłe programy i ciekawe osobowości: Monika Olejnik, Beata Pawlikowska, Janusz Weiss, Marzena Chełminiak, Marcin Prokop, Rafał Bryndal. Koncerty na żywo i ciekawe wywiady. Pasja, dystans do siebie i poczucie humoru. Kanały internetowe.	2011-03-21 15:30:03.302	\N	0	71
http://mario.pl			2011-03-21 15:29:46.583	\N	0	72
http://rmf.fm	RMF FM :: Radio Muzyka Fakty	Radio numer 1 w Polsce! Największa i najpopularniejsza stacja muzyczno-informacyjna. Zawsze najlepsza muzyka i najświeższe fakty. Posłuchaj radio online.	2011-03-21 15:30:13.161	\N	0	73
http://vim.org			2011-03-21 15:30:22.223	\N	0	74
http://alamakota.pl	AlaMaKota - strona dla dzieci, gry oraz zabawy edukacyjne, ilustracje, alfabet	AlaMaKota - strona dla dzieci, gry oraz zabawy edukacyjne, ilustracje, alfabet	2011-03-21 15:30:32.395	\N	0	75
http://bambino.pl			2011-03-21 15:30:40.255	\N	0	76
http://dandelion.com.pl	Dandelion Software House		2011-03-21 15:31:08.567	\N	0	77
http://onet.pl	Onet.pl - Polski Portal Internetowy		2011-03-28 08:02:54.062	\N	\N	79
\.


--
-- TOC entry 1501 (class 0 OID 0)
-- Dependencies: 4
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2011-07-21 08:38:38

--
-- PostgreSQL database dump complete
--

