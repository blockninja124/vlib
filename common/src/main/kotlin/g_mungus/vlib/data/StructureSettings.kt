package g_mungus.vlib.data

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import java.io.InputStream

/**
 * Holds information about which structure templates should be placed in the shipyard instead of normally in the world.
 *
 * @property rename Whether the ship should be renamed to match its template name after creation. Defaults to false.
 * @property folder Which folder within data/<namespace>/structures/ should have its templates placed in the shipyard. To specify all, set this value to "/".
 */
data class StructureSettings(
    val rename: Boolean?,
    val folder: String,
)