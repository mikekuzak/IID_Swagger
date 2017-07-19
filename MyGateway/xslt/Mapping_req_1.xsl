<?xml version="1.0" encoding="UTF-8"?>
<!-- @generated mapFile="xslt/Mapping_req_1.map" md5sum="3d30ac5afd0702954fe7b8c60fbe6d44" version="8.0.400" -->
<!--
*****************************************************************************
*   This file has been generated by the IBM XML Mapping Editor.
*
*   Mapping file:		Mapping_req_1.map
*   Map declaration(s):	Mapping_req_1
*   Input file(s):		smo://smo/name%3Dwsdl-primary/message%3D%257Bhttp%253A%252F%252FMyGateway%252FCar%257DgetCarByIdRequestMsg/xpath%3D%252Fbody/smo.xsd
*   Output file(s):		smo://smo/name%3Dwsdl-primary/message%3D%257Bhttp%253A%252F%252FMyGateway%252FCar%257DgetCarByIdResponseMsg/xpath%3D%252Fbody/smo.xsd
*
*   Note: Do not modify the contents of this file as it is overwritten
*         each time the mapping model is updated.
*****************************************************************************
-->
<xsl:stylesheet
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xalan="http://xml.apache.org/xslt"
    xmlns:math="http://exslt.org/math"
    xmlns:str="http://exslt.org/strings"
    xmlns:set="http://exslt.org/sets"
    xmlns:date="http://exslt.org/dates-and-times"
    xmlns:exsl="http://exslt.org/common"
    xmlns:xs4xs="http://www.w3.org/2001/XMLSchema"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:io5="http://www.w3.org/2003/05/soap-envelope"
    xmlns:io4="http://www.ibm.com/xmlns/prod/websphere/mq/sca/6.0.0"
    xmlns:io3="http://www.ibm.com/websphere/sibx/smo/v6.0.1"
    xmlns:io2="http://MyGateway/Car"
    xmlns:io8="http://www.ibm.com/xmlns/prod/websphere/http/sca/6.1.0"
    xmlns:io9="http://www.w3.org/2005/08/addressing"
    xmlns:io6="http://MyGateway"
    xmlns:io7="wsdl.http://MyGateway/Car"
    xmlns:io="http://schemas.xmlsoap.org/ws/2004/08/addressing"
    xmlns:map="http://MyGateway/xslt/Mapping_req_1"
    xmlns:msl="http://www.ibm.com/xmlmap"
    exclude-result-prefixes="math str set date exsl map xalan msl"
    version="1.0">
  <xsl:output method="xml" encoding="UTF-8" indent="no"/>

  <!-- root wrapper template  -->
  <xsl:template match="/">
    <xsl:choose>
      <xsl:when test="msl:datamap">
        <msl:datamap>
          <xsl:element name="dataObject">
            <xsl:attribute name="xsi:type">
              <xsl:value-of select="'io7:getCarByIdResponseMsg'"/>
            </xsl:attribute>
            <xsl:call-template name="map:Mapping_req_12">
              <xsl:with-param name="body" select="msl:datamap/dataObject[1]"/>
            </xsl:call-template>
          </xsl:element>
        </msl:datamap>
      </xsl:when>
      <xsl:otherwise>
        <xsl:apply-templates select="body" mode="map:Mapping_req_1"/>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>

  <!-- This rule represents an element mapping: "body" to "body".  -->
  <xsl:template match="body"  mode="map:Mapping_req_1">
    <body>
      <xsl:attribute name="xsi:type">
        <xsl:value-of select="'io7:getCarByIdResponseMsg'"/>
      </xsl:attribute>
      <io2:getCarByIdResponse>
        <output>
          <!-- a simple data mapping: "io2:getCarById/input"(int) to "id"(string) -->
          <xsl:if test="io2:getCarById/input">
            <xsl:element name="id">
              <xsl:value-of select="io2:getCarById/input"/>
            </xsl:element>
          </xsl:if>
          <!-- a simple mapping with no associated source:  to "name"(string) -->
          <xsl:element name="name">
            <xsl:text>Mercedes</xsl:text>
          </xsl:element>
          <!-- a simple mapping with no associated source:  to "model"(string) -->
          <xsl:element name="model">
            <xsl:text>S600</xsl:text>
          </xsl:element>
          <!-- a simple mapping with no associated source:  to "year"(string) -->
          <xsl:element name="year">
            <xsl:text>2016</xsl:text>
          </xsl:element>
          <!-- a simple mapping with no associated source:  to "price"(int) -->
          <xsl:element name="price">
            <xsl:text>200000</xsl:text>
          </xsl:element>
          <spec>
            <!-- a simple mapping with no associated source:  to "id"(int) -->
            <xsl:element name="id">
              <xsl:text>54</xsl:text>
            </xsl:element>
            <!-- a simple mapping with no associated source:  to "color"(string) -->
            <xsl:element name="color">
              <xsl:text>Black</xsl:text>
            </xsl:element>
            <!-- a simple mapping with no associated source:  to "mph"(int) -->
            <xsl:element name="mph">
              <xsl:text>200</xsl:text>
            </xsl:element>
            <!-- a simple mapping with no associated source:  to "ps"(int) -->
            <xsl:element name="ps">
              <xsl:text>450</xsl:text>
            </xsl:element>
          </spec>
        </output>
      </io2:getCarByIdResponse>
    </body>
  </xsl:template>

  <!-- This rule represents a type mapping: "body" to "body".  -->
  <xsl:template name="map:Mapping_req_12">
    <xsl:param name="body"/>
    <io2:getCarByIdResponse>
      <output>
        <!-- a simple data mapping: "$body/io2:getCarById/input"(int) to "id"(string) -->
        <xsl:if test="$body/io2:getCarById/input">
          <xsl:element name="id">
            <xsl:value-of select="$body/io2:getCarById/input"/>
          </xsl:element>
        </xsl:if>
        <!-- a simple mapping with no associated source:  to "name"(string) -->
        <xsl:element name="name">
          <xsl:text>Mercedes</xsl:text>
        </xsl:element>
        <!-- a simple mapping with no associated source:  to "model"(string) -->
        <xsl:element name="model">
          <xsl:text>S600</xsl:text>
        </xsl:element>
        <!-- a simple mapping with no associated source:  to "year"(string) -->
        <xsl:element name="year">
          <xsl:text>2016</xsl:text>
        </xsl:element>
        <!-- a simple mapping with no associated source:  to "price"(int) -->
        <xsl:element name="price">
          <xsl:text>200000</xsl:text>
        </xsl:element>
        <spec>
          <!-- a simple mapping with no associated source:  to "id"(int) -->
          <xsl:element name="id">
            <xsl:text>54</xsl:text>
          </xsl:element>
          <!-- a simple mapping with no associated source:  to "color"(string) -->
          <xsl:element name="color">
            <xsl:text>Black</xsl:text>
          </xsl:element>
          <!-- a simple mapping with no associated source:  to "mph"(int) -->
          <xsl:element name="mph">
            <xsl:text>200</xsl:text>
          </xsl:element>
          <!-- a simple mapping with no associated source:  to "ps"(int) -->
          <xsl:element name="ps">
            <xsl:text>450</xsl:text>
          </xsl:element>
        </spec>
      </output>
    </io2:getCarByIdResponse>
  </xsl:template>

  <!-- *****************    Utility Templates    ******************  -->
  <!-- copy the namespace declarations from the source to the target -->
  <xsl:template name="copyNamespaceDeclarations">
    <xsl:param name="root"/>
    <xsl:for-each select="$root/namespace::*[not(name() = '')]">
      <xsl:copy/>
    </xsl:for-each>
  </xsl:template>
</xsl:stylesheet>
