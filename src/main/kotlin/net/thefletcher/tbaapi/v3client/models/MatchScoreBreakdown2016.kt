/**
* The Blue Alliance API v3
* # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
*
* The version of the OpenAPI document: 3.04.1
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package net.thefletcher.tbaapi.v3client.models

import net.thefletcher.tbaapi.v3client.models.MatchScoreBreakdown2016Alliance

import com.squareup.moshi.Json
/**
 * See the 2016 FMS API documentation for a description of each value.
 * @param blue 
 * @param red 
 */
data class MatchScoreBreakdown2016 (
    @Json(name = "blue")
    val blue: MatchScoreBreakdown2016Alliance? = null,
    @Json(name = "red")
    val red: MatchScoreBreakdown2016Alliance? = null
) {

}

