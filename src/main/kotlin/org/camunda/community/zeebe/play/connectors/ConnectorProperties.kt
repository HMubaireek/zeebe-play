package org.camunda.community.zeebe.play.connectors

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties("zeebe.connectors")
data class ConnectorProperties(
    val secrets: List<ConnectorSecretProperty> = emptyList()
) {

    data class ConnectorSecretProperty(
        val name: String,
        val value: String
    )
}