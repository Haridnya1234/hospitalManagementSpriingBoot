import { TestBed } from '@angular/core/testing';

import { AccauthService } from './accauth.service';

describe('AccauthService', () => {
  let service: AccauthService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AccauthService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
