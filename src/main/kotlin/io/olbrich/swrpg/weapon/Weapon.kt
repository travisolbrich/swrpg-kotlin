package io.olbrich.swrpg.weapon

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement

@JacksonXmlRootElement(localName= "Weapons")
data class Weapon(@JacksonXmlProperty(localName = "Key") val key: String?,
                  @JacksonXmlProperty(localName = "Name") val name: String?,
                  @JacksonXmlProperty(localName = "Description") val description: String?,
                  @JacksonXmlProperty(localName = "SkillKey") val skillKey: String?,
                  @JacksonXmlProperty(localName = "Damage") val damage: Number?,
                  @JacksonXmlProperty(localName = "Crit") val crit: Number?,
                  @JacksonXmlProperty(localName = "RangeValue") val rangeValue: String?)