/**
* The Blue Alliance API v3
* # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
*
* The version of the OpenAPI document: 3.5
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package net.thefletcher.tbaapi.v3client.apis

import net.thefletcher.tbaapi.v3client.models.APIStatus

import net.thefletcher.tbaapi.v3client.infrastructure.ApiClient
import net.thefletcher.tbaapi.v3client.infrastructure.ClientException
import net.thefletcher.tbaapi.v3client.infrastructure.ClientError
import net.thefletcher.tbaapi.v3client.infrastructure.ServerException
import net.thefletcher.tbaapi.v3client.infrastructure.ServerError
import net.thefletcher.tbaapi.v3client.infrastructure.MultiValueMap
import net.thefletcher.tbaapi.v3client.infrastructure.RequestConfig
import net.thefletcher.tbaapi.v3client.infrastructure.RequestMethod
import net.thefletcher.tbaapi.v3client.infrastructure.ResponseType
import net.thefletcher.tbaapi.v3client.infrastructure.Success
import net.thefletcher.tbaapi.v3client.infrastructure.toMultiValue

class TBAApi(basePath: kotlin.String = "https://www.thebluealliance.com/api/v3") : ApiClient(basePath) {

    /**
    * 
    * Returns API status, and TBA status information.
    * @param ifMinusModifiedMinusSince Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. (optional)
    * @return APIStatus
    */
    @Suppress("UNCHECKED_CAST")
    fun getStatus(ifMinusModifiedMinusSince: kotlin.String?) : APIStatus {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("If-Modified-Since" to ifMinusModifiedMinusSince.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/status",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<APIStatus>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as APIStatus
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }

}
