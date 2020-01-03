--
-- PostgreSQL database dump
--

-- Dumped from database version 11.5 (Ubuntu 11.5-3.pgdg16.04+1)
-- Dumped by pg_dump version 12.0

-- Started on 2019-11-17 21:42:49

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 3852 (class 0 OID 24369305)
-- Dependencies: 196
-- Data for Name: PROJECT; Type: TABLE DATA; Schema: public; Owner: luyapohoobttfg
--

COPY public."PROJECT" ("PROJECTID", "TITLE", "DESCRIPTION", "INSPERATION", "KEYWORD", "PUBLISHDATE", "CATEGORYID", "OWNERID") FROM stdin;
1	String projetct1	No description	\N	\N	2019-11-16	1	1
2	String projetct2	No description	\N	\N	2019-11-16	1	2
3	String projetct3	No description	\N	\N	2019-11-16	1	3
4	String projetct4	No description	\N	\N	2019-11-16	1	4
5	Wind projetct1	No description	\N	\N	2019-11-16	2	5
6	Wind projetct2	No description	\N	\N	2019-11-16	2	6
\.


--
-- TOC entry 3867 (class 0 OID 0)
-- Dependencies: 204
-- Name: PROJECT_CATEGORYID_seq; Type: SEQUENCE SET; Schema: public; Owner: luyapohoobttfg
--

SELECT pg_catalog.setval('public."PROJECT_CATEGORYID_seq"', 6, true);


--
-- TOC entry 3868 (class 0 OID 0)
-- Dependencies: 205
-- Name: PROJECT_OWNERID_seq; Type: SEQUENCE SET; Schema: public; Owner: luyapohoobttfg
--

SELECT pg_catalog.setval('public."PROJECT_OWNERID_seq"', 6, true);


--
-- TOC entry 3869 (class 0 OID 0)
-- Dependencies: 197
-- Name: PROJECT_PROJECTID_seq; Type: SEQUENCE SET; Schema: public; Owner: luyapohoobttfg
--

SELECT pg_catalog.setval('public."PROJECT_PROJECTID_seq"', 1, false);


-- Completed on 2019-11-17 21:42:51

--
-- PostgreSQL database dump complete
--

