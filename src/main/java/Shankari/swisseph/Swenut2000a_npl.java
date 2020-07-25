
/*
   This is a port of the Swiss Ephemeris Free Edition, Version 2.00.00
   of Astrodienst AG, Switzerland from the original C Code to Java. For
   copyright see the original copyright notices below and additional
   copyright notes in the file named LICENSE, or - if this file is not
   available - the copyright notes at http://www.astro.ch/swisseph/ and
   following.

   For any questions or comments regarding this port to Java, you should
   ONLY contact me and not Astrodienst, as the Astrodienst AG is not involved
   in this port in any way.

   Thomas Mack, mack@ifis.cs.tu-bs.de, 28rd of April 2006

*/
/* Copyright (C) 1997, 1998 Astrodienst AG, Switzerland.  All rights reserved.
  
  This file is part of Swiss Ephemeris Free Edition.
  
  Swiss Ephemeris is distributed with NO WARRANTY OF ANY KIND.  No author
  or distributor accepts any responsibility for the consequences of using it,
  or for whether it serves any particular purpose or works at all, unless he
  or she says so in writing.  Refer to the Swiss Ephemeris Public License
  ("SEPL" or the "License") for full details.
  
  Every copy of Swiss Ephemeris must include a copy of the License,
  normally in a plain ASCII text file named LICENSE.  The License grants you
  the right to copy, modify and redistribute Swiss Ephemeris, but only
  under certain conditions described in the License.  Among other things, the
  License requires that the copyright notices and this notice be preserved on
  all copies.

  For uses of the Swiss Ephemeris which do not fall under the definitions
  laid down in the Public License, the Swiss Ephemeris Professional Edition
  must be purchased by the developer before he/she distributes any of his
  software or makes available any product or service built upon the use of
  the Swiss Ephemeris.

  Authors of the Swiss Ephemeris: Dieter Koch and Alois Treindl

  The authors of Swiss Ephemeris have no control or influence over any of
  the derived works, i.e. over software or services created by other
  programmers which use Swiss Ephemeris functions.

  The names of the authors or of the copyright holder (Astrodienst) must not
  be used for promoting any software, product or service which uses or contains
  the Swiss Ephemeris. This copyright notice is the ONLY place where the
  names of the authors can legally appear, except in cases where they have
  given special permission in writing.

  The trademarks 'Swiss Ephemeris' and 'Swiss Ephemeris inside' may be used
  for promoting such software, products or services.
*/
package Shankari.swisseph;

public class Swenut2000a_npl
		{
/* //ifdef NUT_IAU_2000A */
  /* Planetary argument multipliers
   * L L' F D Om Me Ve E Ma Ju Sa Ur Ne pre */
  static final short npl[] = {
  0, 0, 0, 0, 0, 0, 0, 8,-16, 4, 5, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, -8, 16, -4, -5, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 8,-16, 4, 5, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 2, 2,
  0, 0, 0, 0, 0, 0, 0, -4, 8, -1, -5, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 4, -8, 3, 0, 0, 0, 1,
  0, 0, 1, -1, 1, 0, 0, 3, -8, 3, 0, 0, 0, 0,
  -1, 0, 0, 0, 0, 0, 10, -3, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 6, -3, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 4, -8, 3, 0, 0, 0, 0,
  0, 0, 1, -1, 1, 0, 0, -5, 8, -3, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, -4, 8, -3, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 0, 4, -8, 1, 5, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -5, 6, 4, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 2, -5, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 2, -5, 0, 0, 1,
  0, 0, 1, -1, 1, 0, 0, -1, 0, 2, -5, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 2, -5, 0, 0, 0,
  0, 0, 1, -1, 1, 0, 0, -1, 0, -2, 5, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 5, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 5, 0, 0, 2,
  2, 0, -1, -1, 0, 0, 0, 3, -7, 0, 0, 0, 0, 0,
  1, 0, 0, -2, 0, 0, 19,-21, 3, 0, 0, 0, 0, 0,
  0, 0, 1, -1, 1, 0, 2, -4, 0, -3, 0, 0, 0, 0,
  1, 0, 0, -1, 1, 0, 0, -1, 0, 2, 0, 0, 0, 0,
  0, 0, 1, -1, 1, 0, 0, -1, 0, -4, 10, 0, 0, 0,
  -2, 0, 0, 2, 1, 0, 0, 2, 0, 0, -5, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 3, -7, 4, 0, 0, 0, 0, 0,
  0, 0, -1, 1, 0, 0, 0, 1, 0, 1, -1, 0, 0, 0,
  -2, 0, 0, 2, 1, 0, 0, 2, 0, -2, 0, 0, 0, 0,
  -1, 0, 0, 0, 0, 0, 18,-16, 0, 0, 0, 0, 0, 0,
  -2, 0, 1, 1, 2, 0, 0, 1, 0, -2, 0, 0, 0, 0,
  -1, 0, 1, -1, 1, 0, 18,-17, 0, 0, 0, 0, 0, 0,
  -1, 0, 0, 1, 1, 0, 0, 2, -2, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, -8, 13, 0, 0, 0, 0, 0, 2,
  0, 0, 2, -2, 2, 0, -8, 11, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, -8, 13, 0, 0, 0, 0, 0, 1,
  0, 0, 1, -1, 1, 0, -8, 12, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 8,-13, 0, 0, 0, 0, 0, 0,
  0, 0, 1, -1, 1, 0, 8,-14, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 8,-13, 0, 0, 0, 0, 0, 1,
  -2, 0, 0, 2, 1, 0, 0, 2, 0, -4, 5, 0, 0, 0,
  -2, 0, 0, 2, 2, 0, 3, -3, 0, 0, 0, 0, 0, 0,
  -2, 0, 0, 2, 0, 0, 0, 2, 0, -3, 1, 0, 0, 0,
  0, 0, 0, 0, 1, 0, 3, -5, 0, 2, 0, 0, 0, 0,
  -2, 0, 0, 2, 0, 0, 0, 2, 0, -4, 3, 0, 0, 0,
  0, 0, -1, 1, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 1, 0, 0, -1, 2, 0, 0, 0, 0, 0,
  0, 0, 1, -1, 2, 0, 0, -2, 2, 0, 0, 0, 0, 0,
  -1, 0, 1, 0, 1, 0, 3, -5, 0, 0, 0, 0, 0, 0,
  -1, 0, 0, 1, 0, 0, 3, -4, 0, 0, 0, 0, 0, 0,
  -2, 0, 0, 2, 0, 0, 0, 2, 0, -2, -2, 0, 0, 0,
  -2, 0, 2, 0, 2, 0, 0, -5, 9, 0, 0, 0, 0, 0,
  0, 0, 1, -1, 1, 0, 0, -1, 0, 0, 0, -1, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0,
  0, 0, 1, -1, 1, 0, 0, -1, 0, 0, 0, 0, 2, 0,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2,
  -1, 0, 0, 1, 0, 0, 0, 3, -4, 0, 0, 0, 0, 0,
  0, 0, -1, 1, 0, 0, 0, 1, 0, 0, 2, 0, 0, 0,
  0, 0, 1, -1, 2, 0, 0, -1, 0, 0, 2, 0, 0, 0,
  0, 0, 0, 0, 1, 0, 0, -9, 17, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 2, 0, -3, 5, 0, 0, 0, 0, 0, 0,
  0, 0, 1, -1, 1, 0, 0, -1, 0, -1, 2, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -2, 0, 0, 0,
  1, 0, 0, -2, 0, 0, 17,-16, 0, -2, 0, 0, 0, 0,
  0, 0, 1, -1, 1, 0, 0, -1, 0, 1, -3, 0, 0, 0,
  -2, 0, 0, 2, 1, 0, 0, 5, -6, 0, 0, 0, 0, 0,
  0, 0, -2, 2, 0, 0, 0, 9,-13, 0, 0, 0, 0, 0,
  0, 0, 1, -1, 2, 0, 0, -1, 0, 0, 1, 0, 0, 0,
  0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0,
  0, 0, -1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0,
  0, 0, -2, 2, 0, 0, 5, -6, 0, 0, 0, 0, 0, 0,
  0, 0, -1, 1, 1, 0, 5, -7, 0, 0, 0, 0, 0, 0,
  -2, 0, 0, 2, 0, 0, 6, -8, 0, 0, 0, 0, 0, 0,
  2, 0, 1, -3, 1, 0, -6, 7, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 2, 0, 0, 0, 0, 1, 0, 0, 0, 0,
  0, 0, -1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0,
  0, 0, 1, -1, 1, 0, 0, -1, 0, 0, 0, 2, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 1,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 2,
  0, 0, 0, 0, 0, 0, 0, -8, 15, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, -8, 15, 0, 0, 0, 0, 1,
  0, 0, 1, -1, 1, 0, 0, -9, 15, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 8,-15, 0, 0, 0, 0, 0,
  1, 0, -1, -1, 0, 0, 0, 8,-15, 0, 0, 0, 0, 0,
  2, 0, 0, -2, 0, 0, 2, -5, 0, 0, 0, 0, 0, 0,
  -2, 0, 0, 2, 0, 0, 0, 2, 0, -5, 5, 0, 0, 0,
  2, 0, 0, -2, 1, 0, 0, -6, 8, 0, 0, 0, 0, 0,
  2, 0, 0, -2, 1, 0, 0, -2, 0, 3, 0, 0, 0, 0,
  -2, 0, 1, 1, 0, 0, 0, 1, 0, -3, 0, 0, 0, 0,
  -2, 0, 1, 1, 1, 0, 0, 1, 0, -3, 0, 0, 0, 0,
  -2, 0, 0, 2, 0, 0, 0, 2, 0, -3, 0, 0, 0, 0,
  -2, 0, 0, 2, 0, 0, 0, 6, -8, 0, 0, 0, 0, 0,
  -2, 0, 0, 2, 0, 0, 0, 2, 0, -1, -5, 0, 0, 0,
  -1, 0, 0, 1, 0, 0, 0, 1, 0, -1, 0, 0, 0, 0,
  -1, 0, 1, 1, 1, 0,-20, 20, 0, 0, 0, 0, 0, 0,
  1, 0, 0, -2, 0, 0, 20,-21, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 1, 0, 0, 8,-15, 0, 0, 0, 0, 0,
  0, 0, 2, -2, 1, 0, 0,-10, 15, 0, 0, 0, 0, 0,
  0, 0, -1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0,
  0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0,
  0, 0, 1, -1, 2, 0, 0, -1, 0, 1, 0, 0, 0, 0,
  0, 0, 1, -1, 1, 0, 0, -1, 0, -2, 4, 0, 0, 0,
  2, 0, 0, -2, 1, 0, -6, 8, 0, 0, 0, 0, 0, 0,
  0, 0, -2, 2, 1, 0, 5, -6, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1,
  0, 0, 1, -1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0,
  0, 0, 1, -1, 1, 0, 0, -1, 0, 0, 1, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 2,
  0, 0, 2, -2, 1, 0, 0, -9, 13, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 1, 0, 0, 7,-13, 0, 0, 0, 0, 0,
  -2, 0, 0, 2, 0, 0, 0, 5, -6, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 9,-17, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, -9, 17, 0, 0, 0, 0, 2,
  1, 0, 0, -1, 1, 0, 0, -3, 4, 0, 0, 0, 0, 0,
  1, 0, 0, -1, 1, 0, -3, 4, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 2, 0, 0, -1, 2, 0, 0, 0, 0, 0,
  0, 0, -1, 1, 1, 0, 0, 0, 2, 0, 0, 0, 0, 0,
  0, 0, -2, 2, 0, 1, 0, -2, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 3, -5, 0, 2, 0, 0, 0, 0,
  -2, 0, 0, 2, 1, 0, 0, 2, 0, -3, 1, 0, 0, 0,
  -2, 0, 0, 2, 1, 0, 3, -3, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 1, 0, 8,-13, 0, 0, 0, 0, 0, 0,
  0, 0, -1, 1, 0, 0, 8,-12, 0, 0, 0, 0, 0, 0,
  0, 0, 2, -2, 1, 0, -8, 11, 0, 0, 0, 0, 0, 0,
  -1, 0, 0, 1, 0, 0, 0, 2, -2, 0, 0, 0, 0, 0,
  -1, 0, 0, 0, 1, 0, 18,-16, 0, 0, 0, 0, 0, 0,
  0, 0, 1, -1, 1, 0, 0, -1, 0, -1, 1, 0, 0, 0,
  0, 0, 0, 0, 1, 0, 3, -7, 4, 0, 0, 0, 0, 0,
  -2, 0, 1, 1, 1, 0, 0, -3, 7, 0, 0, 0, 0, 0,
  0, 0, 1, -1, 2, 0, 0, -1, 0, -2, 5, 0, 0, 0,
  0, 0, 0, 0, 1, 0, 0, 0, 0, -2, 5, 0, 0, 0,
  0, 0, 0, 0, 1, 0, 0, -4, 8, -3, 0, 0, 0, 0,
  1, 0, 0, 0, 1, 0,-10, 3, 0, 0, 0, 0, 0, 0,
  0, 0, 2, -2, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0,
  -1, 0, 0, 0, 1, 0, 10, -3, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 1, 0, 0, 4, -8, 3, 0, 0, 0, 0,
  0, 0, 0, 0, 1, 0, 0, 0, 0, 2, -5, 0, 0, 0,
  0, 0, -1, 1, 0, 0, 0, 1, 0, 2, -5, 0, 0, 0,
  2, 0, -1, -1, 1, 0, 0, 3, -7, 0, 0, 0, 0, 0,
  -2, 0, 0, 2, 0, 0, 0, 2, 0, 0, -5, 0, 0, 0,
  0, 0, 0, 0, 1, 0, -3, 7, -4, 0, 0, 0, 0, 0,
  -2, 0, 0, 2, 0, 0, 0, 2, 0, -2, 0, 0, 0, 0,
  1, 0, 0, 0, 1, 0,-18, 16, 0, 0, 0, 0, 0, 0,
  -2, 0, 1, 1, 1, 0, 0, 1, 0, -2, 0, 0, 0, 0,
  0, 0, 1, -1, 2, 0, -8, 12, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 1, 0, -8, 13, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 1, -2, 0, 0, 0, 0, 1,
  0, 0, 1, -1, 1, 0, 0, 0, -2, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 1, -2, 0, 0, 0, 0, 0,
  0, 0, 1, -1, 1, 0, 0, -2, 2, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, -1, 2, 0, 0, 0, 0, 1,
  -1, 0, 0, 1, 1, 0, 3, -4, 0, 0, 0, 0, 0, 0,
  -1, 0, 0, 1, 1, 0, 0, 3, -4, 0, 0, 0, 0, 0,
  0, 0, 1, -1, 1, 0, 0, -1, 0, 0, -2, 0, 0, 0,
  0, 0, 1, -1, 1, 0, 0, -1, 0, 0, 2, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2,
  0, 0, 1, -1, 0, 0, 3, -6, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 1, 0, -3, 5, 0, 0, 0, 0, 0, 0,
  0, 0, 1, -1, 2, 0, -3, 4, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 1, 0, 0, -2, 4, 0, 0, 0, 0, 0,
  0, 0, 2, -2, 1, 0, -5, 6, 0, 0, 0, 0, 0, 0,
  0, 0, -1, 1, 0, 0, 5, -7, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 1, 0, 5, -8, 0, 0, 0, 0, 0, 0,
  -2, 0, 0, 2, 1, 0, 6, -8, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 1, 0, 0, -8, 15, 0, 0, 0, 0, 0,
  -2, 0, 0, 2, 1, 0, 0, 2, 0, -3, 0, 0, 0, 0,
  -2, 0, 0, 2, 1, 0, 0, 6, -8, 0, 0, 0, 0, 0,
  1, 0, 0, -1, 1, 0, 0, -1, 0, 1, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 3, -5, 0, 0, 0,
  0, 0, 1, -1, 1, 0, 0, -1, 0, -1, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1,
  0, 0, 1, -1, 1, 0, 0, -1, 0, 1, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 2,
  0, 0, 1, -1, 2, 0, 0, -1, 0, 0, -1, 0, 0, 0,
  0, 0, 0, 0, 1, 0, 0, 0, 0, 0, -1, 0, 0, 0,
  0, 0, -1, 1, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, -7, 13, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 7,-13, 0, 0, 0, 0, 0,
  2, 0, 0, -2, 1, 0, 0, -5, 6, 0, 0, 0, 0, 0,
  0, 0, 2, -2, 1, 0, 0, -8, 11, 0, 0, 0, 0, 0,
  0, 0, 2, -2, 1, -1, 0, 2, 0, 0, 0, 0, 0, 0,
  -2, 0, 0, 2, 0, 0, 0, 4, -4, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 2, -2, 0, 0, 0,
  0, 0, 1, -1, 1, 0, 0, -1, 0, 0, 3, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 2,
  -2, 0, 0, 2, 0, 0, 3, -3, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 2, 0, 0, -4, 8, -3, 0, 0, 0, 0,
  0, 0, 0, 0, 2, 0, 0, 4, -8, 3, 0, 0, 0, 0,
  2, 0, 0, -2, 1, 0, 0, -2, 0, 2, 0, 0, 0, 0,
  0, 0, 1, -1, 2, 0, 0, -1, 0, 2, 0, 0, 0, 0,
  0, 0, 1, -1, 2, 0, 0, 0, -2, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 1, 0, 0, 1, -2, 0, 0, 0, 0, 0,
  0, 0, -1, 1, 0, 0, 0, 2, -2, 0, 0, 0, 0, 0,
  0, 0, -1, 1, 0, 0, 0, 1, 0, 0, -2, 0, 0, 0,
  0, 0, 2, -2, 1, 0, 0, -2, 0, 0, 2, 0, 0, 0,
  0, 0, 1, -1, 1, 0, 3, -6, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 3, -5, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 3, -5, 0, 0, 0, 0, 0, 0,
  0, 0, 1, -1, 1, 0, -3, 4, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, -3, 5, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, -3, 5, 0, 0, 0, 0, 0, 2,
  0, 0, 2, -2, 2, 0, -3, 3, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, -3, 5, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 2, -4, 0, 0, 0, 0, 1,
  0, 0, 1, -1, 1, 0, 0, 1, -4, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 2, -4, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, -2, 4, 0, 0, 0, 0, 1,
  0, 0, 1, -1, 1, 0, 0, -3, 4, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, -2, 4, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 0, -2, 4, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -5, 8, 0, 0, 0, 0, 0, 2,
  0, 0, 2, -2, 2, 0, -5, 6, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, -5, 8, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -5, 8, 0, 0, 0, 0, 0, 1,
  0, 0, 1, -1, 1, 0, -5, 7, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, -5, 8, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 5, -8, 0, 0, 0, 0, 0, 0,
  0, 0, 1, -1, 2, 0, 0, -1, 0, -1, 0, 0, 0, 0,
  0, 0, 0, 0, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0,
  0, 0, -1, 1, 0, 0, 0, 1, 0, -1, 0, 0, 0, 0,
  0, 0, 2, -2, 1, 0, 0, -2, 0, 1, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, -6, 11, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 6,-11, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, -1, 0, 4, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 1, 0, -4, 0, 0, 0, 0, 0, 0,
  2, 0, 0, -2, 1, 0, -3, 3, 0, 0, 0, 0, 0, 0,
  -2, 0, 0, 2, 0, 0, 0, 2, 0, 0, -2, 0, 0, 0,
  0, 0, 2, -2, 1, 0, 0, -7, 9, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 4, -5, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 1,
  0, 0, 1, -1, 1, 0, 0, -1, 0, 2, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 2,
  0, 0, 2, -2, 2, 0, 0, -2, 0, 2, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 2,
  0, 0, 0, 0, 1, 0, 3, -5, 0, 0, 0, 0, 0, 0,
  0, 0, -1, 1, 0, 0, 3, -4, 0, 0, 0, 0, 0, 0,
  0, 0, 2, -2, 1, 0, -3, 3, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 1, 0, 0, 2, -4, 0, 0, 0, 0, 0,
  0, 0, 2, -2, 1, 0, 0, -4, 4, 0, 0, 0, 0, 0,
  0, 0, 1, -1, 2, 0, -5, 7, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 3, -6, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, -3, 6, 0, 0, 0, 0, 1,
  0, 0, 1, -1, 1, 0, 0, -4, 6, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, -3, 6, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 0, -3, 6, 0, 0, 0, 0, 2,
  0, 0, -1, 1, 0, 0, 2, -2, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 1, 0, 2, -3, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, -5, 9, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, -5, 9, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 0, 5, -9, 0, 0, 0, 0, 0,
  0, 0, -1, 1, 0, 0, 0, 1, 0, -2, 0, 0, 0, 0,
  0, 0, 2, -2, 1, 0, 0, -2, 0, 2, 0, 0, 0, 0,
  -2, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0,
  0, 0, -2, 2, 0, 0, 3, -3, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, -6, 10, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, -6, 10, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -2, 3, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -2, 3, 0, 0, 0, 0, 0, 1,
  0, 0, 1, -1, 1, 0, -2, 2, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 2, -3, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 2, -3, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 1,
  0, 0, 1, -1, 1, 0, 0, -1, 0, 3, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 4, -8, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, -4, 8, 0, 0, 0, 0, 2,
  0, 0, -2, 2, 0, 0, 0, 2, 0, -2, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, -4, 7, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, -4, 7, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 0, 4, -7, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 1, 0, -2, 3, 0, 0, 0, 0, 0, 0,
  0, 0, 2, -2, 1, 0, 0, -2, 0, 3, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, -5, 10, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 1, 0, -1, 2, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, -3, 5, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, -3, 5, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 0, 3, -5, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 1, -2, 0, 0, 0, 0, 0, 1,
  0, 0, 1, -1, 1, 0, 1, -3, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 1, -2, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, -1, 2, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, -1, 2, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -7, 11, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -7, 11, 0, 0, 0, 0, 0, 1,
  0, 0, -2, 2, 0, 0, 4, -4, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 2, -3, 0, 0, 0, 0, 0,
  0, 0, 2, -2, 1, 0, -4, 4, 0, 0, 0, 0, 0, 0,
  0, 0, -1, 1, 0, 0, 4, -5, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 1, -1, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, -4, 7, 0, 0, 0, 0, 0, 1,
  0, 0, 1, -1, 1, 0, -4, 6, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, -4, 7, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -4, 6, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -4, 6, 0, 0, 0, 0, 0, 1,
  0, 0, 1, -1, 1, 0, -4, 5, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, -4, 6, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 4, -6, 0, 0, 0, 0, 0, 0,
  -2, 0, 0, 2, 0, 0, 2, -2, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0,
  0, 0, -1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 1, 0, 1, -1, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, -1, 0, 5, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 1, -3, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, -1, 3, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, -7, 12, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -1, 1, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -1, 1, 0, 0, 0, 0, 0, 1,
  0, 0, 1, -1, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 1, -1, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 1, -1, 0, 0, 0, 0, 0, 1,
  0, 0, 1, -1, 1, 0, 1, -2, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, -2, 5, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, -1, 0, 4, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 1, 0, -4, 0, 0, 0, 0,
  0, 0, 0, 0, 1, 0, -1, 1, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, -6, 10, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, -6, 10, 0, 0, 0, 0, 0,
  0, 0, 2, -2, 1, 0, 0, -3, 0, 3, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, -3, 7, 0, 0, 0, 0, 2,
  -2, 0, 0, 2, 0, 0, 4, -4, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, -5, 8, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 5, -8, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, -1, 0, 3, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, -1, 0, 3, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 0, 1, 0, -3, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 2, -4, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, -2, 4, 0, 0, 0, 0, 0, 1,
  0, 0, 1, -1, 1, 0, -2, 3, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, -2, 4, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -6, 9, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -6, 9, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 6, -9, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 1, 0, 0, 1, 0, -2, 0, 0, 0, 0,
  0, 0, 2, -2, 1, 0, -2, 2, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, -4, 6, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 4, -6, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 1, 0, 3, -4, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, -1, 0, 2, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 1, 0, -2, 0, 0, 0, 0,
  0, 0, 0, 0, 1, 0, 0, 1, 0, -1, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, -5, 9, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 3, -4, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, -3, 4, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -3, 4, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 3, -4, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 3, -4, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 1, 0, 0, 2, -2, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 1, 0, 0, -1, 0, 2, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -3, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 1, 0, 1, -5, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, -1, 0, 1, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 0, 1, 0, -1, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 1, 0, -1, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 0, 1, 0, -3, 5, 0, 0, 0,
  0, 0, 0, 0, 1, 0, -3, 4, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -2, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 2, -2, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0,
  0, 0, 0, 0, 1, 0, 0, -1, 0, 1, 0, 0, 0, 0,
  0, 0, 0, 0, 1, 0, 0, -2, 2, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, -8, 14, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 1, 0, 2, -5, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 5, -8, 3, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 5, -8, 3, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 3, -8, 3, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, -3, 8, -3, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 1, 0, -2, 5, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -8, 12, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -8, 12, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 1, 0, 1, -2, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 2, 0, 0, 2,
  0, 0, 2, -2, 1, 0, -5, 5, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 3, -6, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, -3, 6, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, -3, 6, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, -1, 4, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -5, 7, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -5, 7, 0, 0, 0, 0, 0, 1,
  0, 0, 1, -1, 1, 0, -5, 6, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 5, -7, 0, 0, 0, 0, 0, 0,
  0, 0, 2, -2, 1, 0, 0, -1, 0, 1, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, -1, 0, 1, 0, 0, 0, 0,
  0, 0, 0, 0, 0, -1, 0, 3, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 1, 0, 2, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, -2, 6, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 1, 0, 2, -2, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, -6, 9, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 6, -9, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, -2, 2, 0, 0, 0, 0, 0, 1,
  0, 0, 1, -1, 1, 0, -2, 1, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 2, -2, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 2, -2, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 0, 1, 0, 3, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, -5, 7, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 5, -7, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 1, 0, -2, 2, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 4, -5, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 1, -3, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, -1, 3, 0, 0, 0, 0, 0, 1,
  0, 0, 1, -1, 1, 0, -1, 2, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, -1, 3, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -7, 10, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -7, 10, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 0, 3, -3, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, -4, 8, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -4, 5, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -4, 5, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 4, -5, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, -2, 0, 5, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -9, 13, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, -1, 5, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, -2, 0, 4, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 2, 0, -4, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, -2, 7, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 2, 0, -3, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, -2, 5, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, -2, 5, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -6, 8, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -6, 8, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 6, -8, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 1, 0, 0, 2, 0, -2, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, -3, 9, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 5, -6, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 5, -6, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 2, 0, -2, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 2, 0, -2, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 0, 2, 0, -2, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -5, 10, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 4, -4, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 4, -4, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -3, 3, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 3, -3, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 3, -3, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 3, -3, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -3, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, -5, 13, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 2, 0, -1, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 2, 0, -1, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 0, 3, -2, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 3, -2, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -1, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, -6, 15, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -8, 15, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -3, 9, -4, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 2, 0, 2, -5, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, -2, 8, -1, -5, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 6, -8, 3, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 1,
  0, 0, 1, -1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, -6, 16, -4, -5, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, -2, 8, -3, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, -2, 8, -3, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 6, -8, 1, 5, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 2, 0, -2, 5, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 3, -5, 4, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -8, 11, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -8, 11, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, -8, 11, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 11, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 1, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 3, -3, 0, 2, 0, 0, 0, 2,
  0, 0, 2, -2, 1, 0, 0, 4, -8, 3, 0, 0, 0, 0,
  0, 0, 1, -1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0,
  0, 0, 2, -2, 1, 0, 0, -4, 8, -3, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 1, 2, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -3, 7, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -5, 6, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -5, 6, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 5, -6, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 5, -6, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, -1, 6, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 7, -9, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 2, -1, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 2, -1, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 6, -7, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 5, -5, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -1, 4, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, -1, 4, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -7, 9, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -7, 9, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 0, 4, -3, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 3, -1, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -4, 4, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 4, -4, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 4, -4, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 4, -4, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 2, 1, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, -3, 0, 5, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -9, 12, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 3, 0, -4, 0, 0, 0, 0,
  0, 0, 2, -2, 1, 0, 1, -1, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 7, -8, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 3, 0, -3, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 3, 0, -3, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -2, 6, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -6, 7, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 6, -7, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 6, -6, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 3, 0, -2, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 3, 0, -2, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 5, -4, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 3, -2, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 3, -2, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 3, 0, -1, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 3, 0, -1, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 3, 0, 0, -2, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 4, -2, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 3, 0, 0, -1, 0, 0, 2,
  0, 0, 2, -2, 1, 0, 0, 1, 0, -1, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, -8, 16, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 3, 0, 2, -5, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 7, -8, 3, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, -5, 16, -4, -5, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, -1, 8, -3, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -8, 10, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -8, 10, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, -8, 10, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 3, 0, 1, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -3, 8, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -5, 5, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 5, -5, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 5, -5, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 5, -5, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 7, -7, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 7, -7, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 6, -5, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 7, -8, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 5, -3, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 4, -3, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 1, 2, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -9, 11, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -9, 11, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 0, 4, 0, -4, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 4, 0, -3, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -6, 6, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 6, -6, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 6, -6, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 0, 4, 0, -2, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 6, -4, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 3, -1, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 3, -1, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 3, -1, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 4, 0, -1, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 4, 0, 0, -2, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 5, -2, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 8, -9, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 5, -4, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, -7, 7, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 7, -7, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 4, -2, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 4, -2, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 4, -2, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 4, -2, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 5, 0, -4, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 5, 0, -3, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 5, 0, -2, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -8, 8, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 8, -8, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 5, -3, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 5, -3, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, -9, 9, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, -9, 9, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, -9, 9, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 9, -9, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 6, -4, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 1,
  0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 2,
  0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2,
  1, 0, 0, -2, 0, 0, 0, 2, 0, -2, 0, 0, 0, 0,
  1, 0, 0, -2, 0, 0, 2, -2, 0, 0, 0, 0, 0, 0,
  1, 0, 0, -2, 0, 0, 0, 1, 0, -1, 0, 0, 0, 0,
  1, 0, 0, -2, 0, 0, 1, -1, 0, 0, 0, 0, 0, 0,
  -1, 0, 0, 0, 0, 0, 3, -3, 0, 0, 0, 0, 0, 0,
  -1, 0, 0, 0, 0, 0, 0, 2, 0, -2, 0, 0, 0, 0,
  -1, 0, 0, 2, 0, 0, 0, 4, -8, 3, 0, 0, 0, 0,
  1, 0, 0, -2, 0, 0, 0, 4, -8, 3, 0, 0, 0, 0,
  -2, 0, 0, 2, 0, 0, 0, 4, -8, 3, 0, 0, 0, 0,
  -1, 0, 0, 0, 0, 0, 0, 2, 0, -3, 0, 0, 0, 0,
  -1, 0, 0, 0, 0, 0, 0, 1, 0, -1, 0, 0, 0, 0,
  -1, 0, 0, 0, 0, 0, 1, -1, 0, 0, 0, 0, 0, 0,
  -1, 0, 0, 2, 0, 0, 2, -2, 0, 0, 0, 0, 0, 0,
  1, 0, -1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0,
  -1, 0, 0, 2, 0, 0, 0, 2, 0, -3, 0, 0, 0, 0,
  -2, 0, 0, 0, 0, 0, 0, 2, 0, -3, 0, 0, 0, 0,
  1, 0, 0, 0, 0, 0, 0, 4, -8, 3, 0, 0, 0, 0,
  -1, 0, 1, -1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0,
  1, 0, 1, -1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0,
  -1, 0, 0, 0, 0, 0, 0, 4, -8, 3, 0, 0, 0, 0,
  -1, 0, 0, 2, 1, 0, 0, 2, 0, -2, 0, 0, 0, 0,
  0, 0, 0, 0, 0, 0, 0, 2, 0, -2, 0, 0, 0, 0,
  -1, 0, 0, 2, 0, 0, 0, 2, 0, -2, 0, 0, 0, 0,
  -1, 0, 0, 2, 0, 0, 3, -3, 0, 0, 0, 0, 0, 0,
  1, 0, 0, -2, 1, 0, 0, -2, 0, 2, 0, 0, 0, 0,
  1, 0, 2, -2, 2, 0, -3, 3, 0, 0, 0, 0, 0, 0,
  1, 0, 2, -2, 2, 0, 0, -2, 0, 2, 0, 0, 0, 0,
  1, 0, 0, 0, 0, 0, 1, -1, 0, 0, 0, 0, 0, 0,
  1, 0, 0, 0, 0, 0, 0, 1, 0, -1, 0, 0, 0, 0,
  0, 0, 0, -2, 0, 0, 2, -2, 0, 0, 0, 0, 0, 0,
  0, 0, 0, -2, 0, 0, 0, 1, 0, -1, 0, 0, 0, 0,
  0, 0, 2, 0, 2, 0, -2, 2, 0, 0, 0, 0, 0, 0,
  0, 0, 2, 0, 2, 0, 0, -1, 0, 1, 0, 0, 0, 0,
  0, 0, 2, 0, 2, 0, -1, 1, 0, 0, 0, 0, 0, 0,
  0, 0, 2, 0, 2, 0, -2, 3, 0, 0, 0, 0, 0, 0,
  0, 0, 0, 2, 0, 0, 0, 2, 0, -2, 0, 0, 0, 0,
  0, 0, 1, 1, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0,
  1, 0, 2, 0, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0,
  -1, 0, 2, 0, 2, 0, 10, -3, 0, 0, 0, 0, 0, 0,
  0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0,
  1, 0, 2, 0, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0,
  0, 0, 2, 0, 2, 0, 0, 4, -8, 3, 0, 0, 0, 0,
  0, 0, 2, 0, 2, 0, 0, -4, 8, -3, 0, 0, 0, 0,
  -1, 0, 2, 0, 2, 0, 0, -4, 8, -3, 0, 0, 0, 0,
  2, 0, 2, -2, 2, 0, 0, -2, 0, 3, 0, 0, 0, 0,
  1, 0, 2, 0, 1, 0, 0, -2, 0, 3, 0, 0, 0, 0,
  0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0,
  -1, 0, 2, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0,
  -2, 0, 2, 2, 2, 0, 0, 2, 0, -2, 0, 0, 0, 0,
  0, 0, 2, 0, 2, 0, 2, -3, 0, 0, 0, 0, 0, 0,
  0, 0, 2, 0, 2, 0, 1, -1, 0, 0, 0, 0, 0, 0,
  0, 0, 2, 0, 2, 0, 0, 1, 0, -1, 0, 0, 0, 0,
  0, 0, 2, 0, 2, 0, 2, -2, 0, 0, 0, 0, 0, 0,
  -1, 0, 2, 2, 2, 0, 0, -1, 0, 1, 0, 0, 0, 0,
  1, 0, 2, 0, 2, 0, -1, 1, 0, 0, 0, 0, 0, 0,
  -1, 0, 2, 2, 2, 0, 0, 2, 0, -3, 0, 0, 0, 0,
  2, 0, 2, 0, 2, 0, 0, 2, 0, -3, 0, 0, 0, 0,
  1, 0, 2, 0, 2, 0, 0, -4, 8, -3, 0, 0, 0, 0,
  1, 0, 2, 0, 2, 0, 0, 4, -8, 3, 0, 0, 0, 0,
  1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0,
  0, 0, 2, 0, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0,
  2, 0, 2, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0,
  -1, 0, 2, 2, 2, 0, 0, 2, 0, -2, 0, 0, 0, 0,
  -1, 0, 2, 2, 2, 0, 3, -3, 0, 0, 0, 0, 0, 0,
  1, 0, 2, 0, 2, 0, 1, -1, 0, 0, 0, 0, 0, 0,
  0, 0, 2, 2, 2, 0, 0, 2, 0, -2, 0, 0, 0, 0,
  };
/* //endif /+ NUT_IAU_2000A */

}