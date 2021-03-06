/*
 * Copyright (c) 2018. utaka and/or its affiliates.
 */

package com.utaka.inspire.security;

import java.io.Serializable;

/**
 * 身份凭证提供者
 *
 * @author LANXE
 */
public interface CredentialProvider<T extends Credential> extends Serializable {

    T get(String user);

    T create(T credential);

    T update(String user, T credential) throws AuthenticationException;

    T delete(T credential);

}
