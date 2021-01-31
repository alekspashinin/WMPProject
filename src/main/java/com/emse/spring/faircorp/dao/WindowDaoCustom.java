/**
 *
 *                      UJM * EMSE
 *
 *                  * Aleksei PASHININ *
 *
 *                     WMP Project
 *
 */

package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Window;

import java.util.List;

public interface WindowDaoCustom {

    List<Window> findRoomOpenWindows(Long id);

    List<Window> findRoomWindows(Long id);

    void deleteWindows(Long id);
}
