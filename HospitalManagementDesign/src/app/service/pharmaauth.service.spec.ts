import { TestBed } from '@angular/core/testing';

import { PharmaauthService } from './pharmaauth.service';

describe('PharmaauthService', () => {
  let service: PharmaauthService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PharmaauthService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
