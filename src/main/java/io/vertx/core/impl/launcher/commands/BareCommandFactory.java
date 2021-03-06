/*
 * Copyright (c) 2011-2019 Contributors to the Eclipse Foundation
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the Apache License, Version 2.0
 * which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
 */

package io.vertx.core.impl.launcher.commands;

import io.vertx.core.spi.launcher.DefaultCommandFactory;

/**
 * Factory to create the {@code bare} command.
 *
 * @author Clement Escoffier <clement@apache.org>
 */
public class BareCommandFactory extends DefaultCommandFactory<BareCommand> {

  /**
   * Creates a new instance of {@link BareCommandFactory}.
   */
  public BareCommandFactory() {
    super(BareCommand.class, BareCommand::new);
  }
}
