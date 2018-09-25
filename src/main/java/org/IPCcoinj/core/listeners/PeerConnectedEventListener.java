/*
 * Copyright 2011 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.IPCcoinj.core.listeners;

import org.IPCcoinj.core.Peer;
import org.IPCcoinj.core.PeerGroup;

/**
 * <p>Implementors can listen to events indicating a new peer connecting.</p>
 */
public interface PeerConnectedEventListener {

    /**
     * Called when a peer is connected. If this listener is registered to a {@link Peer} instead of a {@link PeerGroup},
     * peerCount will always be 1.
     *
     * @param peer
     * @param peerCount the total number of connected peers
     */
    void onPeerConnected(Peer peer, int peerCount);
}
