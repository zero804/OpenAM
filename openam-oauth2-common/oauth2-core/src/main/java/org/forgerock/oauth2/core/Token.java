/*
 * The contents of this file are subject to the terms of the Common Development and
 * Distribution License (the License). You may not use this file except in compliance with the
 * License.
 *
 * You can obtain a copy of the License at legal/CDDLv1.0.txt. See the License for the
 * specific language governing permission and limitations under the License.
 *
 * When distributing Covered Software, include this CDDL Header Notice in each file and include
 * the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 * Header, with the fields enclosed by brackets [] replaced by your own identifying
 * information: "Portions copyright [year] [name of copyright owner]".
 *
 * Copyright 2012-2014 ForgeRock AS.
 */

package org.forgerock.oauth2.core;

import java.util.Map;
import java.util.Set;

/**
 * Implements the common methods and attributes of all standard OAuth 2 tokens.
 *
 * @since 11.0.0
 */
public interface Token {

    /**
     * Get the string representation of the identifier of this token.
     *
     * @return The unique identifier of the represented token.
     */
    public String getTokenID();

    /**
     * Get tokens UserID.
     *
     * @return The ID of user.
     */
    public String getUserID();

    /**
     * Get Tokens Realm.
     *
     * @return The realm.
     */
    public String getRealm();

    /**
     * Gets the tokens scope.
     *
     * @return Set of strings that are the tokens scope.
     */
    public Set<String> getScope();

    /**
     * Get the exact expiration time in POSIX format.
     *
     * @return long representation of the maximum valid date.
     */
    public long getExpireTime();

    /**
     * Checks if token is expired.
     *
     * @return true if expired, false if not expired.
     */
    public boolean isExpired();

    /**
     * Returns the token type.
     *
     * @return The type of token. For example "BearerToken".
     */
    public String getTokenType();

    /**
     * Returns the name of the token.
     *
     * @return The name of token. Will be either access_token, code, refresh_token.
     */
    public String getTokenName();

    /**
     * Returns the client_id associated token.
     *
     * @return The client_id associated with token.
     */
    public String getClientID();

    /**
     * Converts the token to Map.
     *
     * @return new Map representation of this AccessToken.
     */
    public Map<String, Object> convertToMap();

    /**
     * Gets information about the token for the tokeninfo end point.
     *
     * @return The token info.
     */
    public Map<String, Object> getTokenInfo();
}
