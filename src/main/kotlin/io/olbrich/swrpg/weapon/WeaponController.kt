package io.olbrich.swrpg.weapon

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.dataformat.xml.XmlMapper
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile

@RestController
class WeaponController {

    @PostMapping("/")
    fun convertFromXml(@RequestParam file: MultipartFile): List<Weapon> {
        val xmlMapper = XmlMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
        val weapons: List<Weapon> = xmlMapper.readValue(file.bytes, xmlMapper.typeFactory.constructCollectionType(List::class.java, Weapon::class.java))

        return weapons
    }
}